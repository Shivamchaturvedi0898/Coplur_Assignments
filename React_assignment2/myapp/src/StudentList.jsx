import React from "react";


function StudentList({Student}){

return(
    <>
    <table border="1"  style={{ marginTop: '20px',  }}>
    <thead>
        <tr>
          <th>Name</th>
          <th>math</th>
          <th>science</th>
          <th>English</th>
          <th>Total</th>
          <th>Percentage</th>
        </tr>
      </thead>
      <tbody>
      {Student.map((Student , id)=>{
   const total = Student.math +Student.science +Student.english;
   const percentage = ((total/300)*100).toFixed(2);
   return (
    <tr key={id}>
      <td>{Student.name}</td>
      <td>{Student.math}</td>
      <td>{Student.science}</td>
      <td>{Student.english}</td>
      <td>{total}</td>
      <td>{percentage}%</td>
    </tr>
  );
})}
</tbody>
</table>
    </>
     
)


}

export default StudentList