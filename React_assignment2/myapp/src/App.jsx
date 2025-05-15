import React from "react";
import StudentList from "./StudentList";

function Student(){
  const Students = [
    { name: "sohel", math: 80, science: 75, english: 85 },
    { name: "nitin", math: 90, science: 88, english: 92 },
    { name: "anubhav", math: 70, science: 65, english: 60 },
    { name: "gupta", math: 85, science: 80, english: 89 },
    { name: "anu", math: 60, science: 55, english: 58 },
    { name: "tinku", math: 95, science: 92, english: 96 },
    { name: "rinku", math: 50, science: 45, english: 55 },
    { name: "shiya", math: 78, science: 72, english: 80 },
    { name: "Vikram", math: 68, science: 70, english: 74 },
    { name: "pandey", math: 88, science: 85, english: 90 },
  ];

return(
  <>
<h1> student marks</h1>
<StudentList Student ={Students}></StudentList>
</>
);
}


export default Student