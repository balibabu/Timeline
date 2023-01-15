import React, { Component } from 'react'

export default class Toggle2 extends Component {
    constructor(props) {
        super(props);
        this.state = {
            switch: false
        }
    }

     // This syntax ensures `this` is bound within clickHandler.
    clickHandler=()=> {
        this.setState((prevState) => {
            return { switch: !prevState.switch }
        });
    }

    render() {
        return (<>
            <h3>Switch <button onClick={this.clickHandler}>{this.state.switch ? "ON" : "OFF"}</button></h3>
        </>);
    }
}