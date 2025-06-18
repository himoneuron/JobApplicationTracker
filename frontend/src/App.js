import React, { useEffect, useState } from "react";

function App() {
  const [jobs, setJobs] = useState([]);

  useEffect(() => {
    fetch("/api/jobs")
      .then((response) => response.json())
      .then((data) => setJobs(data))
      .catch((error) => console.error("Error fetching jobs:", error));
  }, []);

  return (
    <div style={{ padding: "20px" }}>
      <h1>Job Applications</h1>
      {jobs.length === 0 ? (
        <p>No jobs found.</p>
      ) : (
        <ul>
          {jobs.map((job) => (
            <li key={job.id} style={{ border: "1px solid #ccc", marginBottom: "10px", padding: "10px", listStyleType: "none" }}>
              <h3><strong>{job.position}</strong> at {job.company}</h3>
              <p><strong>Applied Date:</strong> {job.appliedDate ? new Date(job.appliedDate).toLocaleDateString() : 'N/A'}</p>
              <p><strong>Status:</strong> {job.status || 'N/A'}</p>
              <p><strong>CV Reference:</strong> {job.cvReference || 'N/A'}</p>
              <p><strong>User Requirements:</strong> {job.userRequirements || 'N/A'}</p>
              <p><strong>Notes:</strong> {job.notes || 'N/A'}</p>
            </li>
          ))}
        </ul>
      )}
    </div>
  );
}

export default App;
