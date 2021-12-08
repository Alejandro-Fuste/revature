## Project One

# Database

- Employee Schema

  - First Name: string
  - Last Name: string
  - Id: int primary key

- Reimbursements

  - id: primary
  - employee Id: refers to id in employee table
  - expense_name: string
  - expense_amount: float
  - expense_reason: string
  - accepted: boolean

- Manager

  - id: primary key
  - First Name: string
  - Last Name: string

- or this schema

- User Schema

  - First Name: string
  - Last Name: string
  - Id: int primary key
  - Role: string (manager or employee)
  - user_name: string
  - password: string

- Reimbursements

  - id: primary
  - employee Id: refers to id in employee table
  - expense_name: string
  - expense_amount: float
  - expense_reason: string
  - status: string (past, pending, accepted)
  - date: date.now()
  - accepted_date: date.now()
  - reject_reason: string

- Seed File

  - This will contain starting off data

- Employee CRUD

  - create/add a reimbursement request
  - read his/her own reimbursements
  - read password from delete
  - delete credential/role from local storage (service layer/front end)

- Manager CRUD
  - create/add reimbursements
  - read:
    - manager should be able to see all users
    - manager should be able to view pending reimbursements
    - manager should be able to view accept reimbursements
    - manager should be able to view rejected reimbursements
    - manager should be able to view accept reimbursements
