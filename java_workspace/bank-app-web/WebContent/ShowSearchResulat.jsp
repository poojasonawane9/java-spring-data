<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="css/style.css">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">MY BANK</a>
         <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarText">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                    <a class="nav-link" href="New Account.html">New Account</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Withdraw.html">Withdraw Amount</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Deposit Amount.html">Deposit Amount</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Delete Account.html">Delete Account</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Update Details.html">Update Details</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Search Account.html">Search Account</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Fund Transfer.html">Fund Transfer</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Check Bal.html">Check Balance</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Display Details.do">Account Details</a>
                </li>
            </ul>
            
        </div>
    </nav>
<table class="table table-bordered" style="margin-top:80px;">
            <thead style="background-color:darkcyan;">
              <tr>
                <th scope="col">Account Id</th>
                <th scope="col">Account Holder Name</th>
                <th scope="col">Account Type</th>
                <th scope="col">Account Balance</th>
              </tr>
            </thead>
            <tbody>
              <tr>
              	<td>${accounts.accountId}</td>
              	<td>${accounts.accountHolderName}</td>
              	<td>${accounts.accountType}</td>
              	<td>${accounts.accountBalance}</td>
              </tr>
            </tbody>
          </table>
</body>
</html>