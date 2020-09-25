import React, { Component } from 'react';
import {StyleSheet, View, Text, Button, NativeModules,DeviceEventEmitter} from 'react-native';
class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
    };
  }
   componentDidMount(){
      DeviceEventEmitter.addListener("EventA",event=>{
         console.log(event)
      })
  }
  render() {
    return (
      <View>
          <Button
                title="Navigate Me"
                onPress={() => {
                    NativeModules.MyModule.NavigateMe();
                }}
            />
            <Button
                title="Second Screen"
                onPress={() => {
                    this.setState({visible: true})
                }}
            />
      </View>
    );
  }
}

export default App;
