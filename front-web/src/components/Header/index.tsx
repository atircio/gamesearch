import React from "react";
import { ReactComponent as Logo } from "../../assets/logo.svg";
import { Link } from "react-router-dom";

import './style.css'

const Header = () => (
    <header className="main-header">
        <Logo />
        <Link to={'/'}>
            <div className="logo-text">
                <span className="logo-text-1">Game</span>
                <span className="logo-text-2"> Search</span>
            </div>
        </Link>
    </header>
);

export default Header;