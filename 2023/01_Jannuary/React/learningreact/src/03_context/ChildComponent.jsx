import React from 'react'
import ThemeContext from './ThemeContext';

function ChildComponent() {
    const theme = React.useContext(ThemeContext);
    return (
        <div>ChildComponent the theme is {theme}</div>
    )
}

export default ChildComponent;