import React from "react";
import { ReactComponent as Logo } from "../../assets/logo.svg";
import './style.css'

const Header = () => (
    <header className="main-header">
        <Logo/>
        <div className="logo-text">
        <span className="logo-text-1">Game</span>
        <span className="logo-text-2"> Search</span>

        </div>
    </header>
);

export default Header;