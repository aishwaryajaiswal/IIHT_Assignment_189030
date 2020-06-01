import React from 'react';
import { Button, Form, FormGroup, Label, Input, FormText } from 'reactstrap';

const Example = (props) => {
  return (
    <div className="formCss">
    <Form>
    <FormGroup>
        <Label for="exampleFirstName">FirstName</Label>
        <Input type="text" name="text"  placeholder="Enter the first name " />
      </FormGroup>
      <FormGroup>
        <Label for="examplelastName">LastName</Label>
        <Input type="text" name="text"  placeholder="Enter the last name" />
      </FormGroup>
      <FormGroup>
        <Label for="exampleEmail">Email</Label>
        <Input type="email" name="email" id="exampleEmail" placeholder="Enter the email" />
      </FormGroup>
      <FormGroup>
        <Label for="examplePassword">Password</Label>
        <Input type="password" name="password" id="examplePassword" placeholder="Enter the password " />
      </FormGroup>
      <FormGroup>
        <Label for="exampleFile">File</Label>
        <Input type="file" name="file" id="exampleFile" />
        <FormText color="muted">
          Please upload your resume ....
        </FormText>
      </FormGroup>
      <FormGroup tag="fieldset">
        <legend>Radio Buttons</legend>
        <FormGroup check>
          <Label check>
            <Input type="radio" name="radio1" />{' '}
            I agree to the terms and conditions of the organisation ...
          </Label>
        </FormGroup>
        <FormGroup check>
          <Label check>
            <Input type="radio" name="radio1" />{' '}
            I do not agree to the terms and conditions of the organisation ...
          </Label>
        </FormGroup>
      </FormGroup>
      <FormGroup check>
        <Label check>
          <Input type="checkbox" />{' '}
          Check me
        </Label>
      </FormGroup>
      <Button>Submit</Button>
    </Form>
    </div>
  );
}

export default Example;