import React from 'react';
import { GrAchievement } from 'react-icons/gr';
import './Overview.css'

const Overview = () => {
  return (
    <div className='d-flex m-3 p-3 shadow-sm rounded bg-light overview'>
      <div className='text-center'>
        <GrAchievement className='mb-3' style={{ fontSize: '2.5rem', color: '#0A2463' }} />
        <h4 className='fw-bold mb-3'>This is the title of the best</h4>
        <p className='text-muted overview-text'>
          The header section of your homepage is crucial for navigation and user experience. 
          It should be clean, intuitive, and provide quick access to the most important parts of your website. 
          Here are some suggested titles for the header section of your booking system website:
        </p>
      </div>
    </div>
  );
};

export default Overview;