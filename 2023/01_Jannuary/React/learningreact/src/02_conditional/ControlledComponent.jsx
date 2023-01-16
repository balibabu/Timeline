import React, { Component } from 'react'

export default class ControlledComponent extends Component {
    constructor(props) {
        super(props);
        this.state = { fullname: "", description: "" };
    }
    onChangeHandler = (event) => {
        this.setState({ [event.target.name]: event.target.value });  // since in class comp. value get merges
    }

    render() {
        return (
    <>
        <fieldset>
        <legend><label htmlFor='name'>Enter your name </label></legend>
            <input type="text" id='name' onChange={this.onChangeHandler} value={this.state.fullname} name='fullname' />
            <textarea onChange={this.onChangeHandler} value={this.state.description} name='description' />
            {/* <input type='file' /> */}
        </fieldset>
    </>
        )
    }
}
