import React, { useEffect, useState } from 'react';

const UserComponent = () => {
  const [user, setUser] = useState(null);
  const [newUser, setNewUser] = useState({ name: '', email: '' });

  // GET user with ID = 1
  useEffect(() => {
    fetch('http://localhost:8080/api/users/1')
      .then(res => res.json())
      .then(data => setUser(data))
      .catch(err => console.error('Fetch error:', err));
  }, []);

  // POST new user
  const handleCreate = () => {
    fetch('http://localhost:8080/api/users', {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify(newUser)
    })
      .then(res => res.text())
      .then(msg => alert(msg))
      .catch(err => console.error('Create error:', err));
  };

  return (
    <div style={{ padding: '20px' }}>
      <h2>🌐 Coplur User API</h2>
      {user ? (
        <>
          <p><b>Name:</b> {user.name}</p>
          <p><b>Email:</b> {user.email}</p>
        </>
      ) : (
        <p>Loading user...</p>
      )}

      <h3>Create New User</h3>
      <input
        placeholder="Name"
        value={newUser.name}
        onChange={(e) => setNewUser({ ...newUser, name: e.target.value })}
      /><br /><br />
      <input
        placeholder="Email"
        value={newUser.email}
        onChange={(e) => setNewUser({ ...newUser, email: e.target.value })}
      /><br /><br />
      <button onClick={handleCreate}>Create User</button>
    </div>
  );
};

export default UserComponent;
