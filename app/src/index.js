import React, {Component} from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import reportWebVitals from './reportWebVitals';
import 'bootstrap/dist/css/bootstrap.min.css'
import './App.css';
import { render } from '@testing-library/react';


class TBanner extends Component{
  render(){
    return(
    <div className = "App">
      <h1>Labs China Toastmasters Attendance Self-Service</h1>
    </div>
    );
  }
}
class Attendance extends Component{
  state = {
    meetingRoles:[],
    memberName:'',
    roleDescription:'TMD',
    meetingRoleId: '1'
  };
  constructor(props) {
    super(props);
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
    this.handleSelectChange = this.handleSelectChange.bind(this);
  } 
  componentDidMount(){
    fetch("http://localhost:8080/meetingroles")
      .then((response) => {
        return response.json();
      })
      .then(data =>{
        this.setState({
          meetingRoles:[].concat(data)
        });
      }).catch(error=>{
        console.log(error);
      });
  }
  handleChange(event){
    this.setState({memberName: event.target.value});
  }
  handleSelectChange(event){
    this.setState({roleDescription: event.target.value, meetingRoleId:event.target.key});
  }
  handleSubmit(event){
    event.preventDefault();
    let requestOptions = {
      method: 'PUT',
      headers: {'Content-Type':'application/json'},
      body: JSON.stringify({name: this.state.memberName, meetingRole: {meetingRoleId: this.state.meetingRoleId,
        roleDescription: this.state.roleDescription}})
    };
    fetch('http://localhost:8080/member', requestOptions)
    .then((response)=>{console.log("This is "+response);})
  }
  render(){
    return(
      <form className = "d-flex justify-content-center flex-column" onSubmit={this.handleSubmit}>
        <div className ="form-group">
          <label for="memberName">TMC Member Name:</label>
          <input type ="text" className = "form-control" id="memberName" placeholder="TMC Member Name" onChange = {this.handleChange} />
         </div>
         <div className ="form-group">
          <label for="meetingRole">Meeting Role:</label>
          <select id="meetingRole" className = "form-control" onChange = {this.handleSelectChange}>
            {this.state.meetingRoles.map((meetingRole)=> <option key ={meetingRole.meetingRoleId} value= {meetingRole.roleDescription}>{meetingRole.roleDescription}</option>)}
          </select>
         </div>
         <div className ="form-group">
            <button type="submit">Attend!!</button>
         </div>
      </form>
    );
  };
}

class App extends Component{
  render(){
    return(
      <div>
        <TBanner/>
        <Attendance/>
      </div>
    );
  };
}




ReactDOM.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
