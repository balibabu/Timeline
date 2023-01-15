import React from "react";

class Toggle extends React.Component{
    constructor(props){
        super(props);
        this.state={
            switch: false
        }
        // This binding is necessary to make `this` work in the callback
        this.clickHandler=this.clickHandler.bind(this);
    }

    clickHandler(){
        this.setState((prevState)=>{
            return {switch:!prevState.switch}
        });
    }

    render(){
        return (<>
            <h3>Switch <button onClick={this.clickHandler}>{this.state.switch?"ON":"OFF"}</button></h3>
            {/* alternative to avoid binding*/}
            {/* <h3>Switch <button onClick={this.clickHandler.bind(this)}>{this.state.switch?"ON":"OFF"}</button></h3> */}
        </>);
    }
}

export default Toggle;