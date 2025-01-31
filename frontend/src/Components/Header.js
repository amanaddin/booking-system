// Header.js
import React from 'react';
import './Header.css';
import HamburgerMenu from './HamburgerMenu';

const Header = () => {
  const titles = ['Hem', 'Tjänster', 'Företag', 'Kontakt', 'Om oss'];
  const titles2 = ['Login', 'Registrera'];

  return (
    <div className="header-container d-flex justify-content-between align-items-center p-4">
      <div className="d-flex f-large p-2 title">HOME</div>

      {/* Desktop Navigation */}
      <div className="d-none d-md-flex">
        {titles.map((item, index) => (
          <div key={index} className="p-2 title m-2">{item}</div>
        ))}
      </div>

      {/* Desktop Auth Links */}
      <div className="d-none d-md-flex">
        {titles2.map((item, index) => (
          <div key={index} className="p-2">{item}</div>
        ))}
      </div>

      {/* Hamburger Menu with all mobile logic */}
      <HamburgerMenu titles={titles} titles2={titles2} />
    </div>
  );
}

export default Header;