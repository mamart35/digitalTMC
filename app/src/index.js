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
  render(){
    return(
    <div className = "ml =1 ">
      <p>This is a placeholder!</p>
    </div>
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
