package app

import modal.Employee
import services.EmployeeService

fun main(){

    var employeeService=EmployeeService()


//Adding Employee
    var employee=Employee(5,"abc",1209,"MR")
    employeeService.addNewEmployee(employee)

    employeeService.viewAllEmployees()







}