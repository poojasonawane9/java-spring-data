<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Display Details</title>
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
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
                <a class="nav-link" href="Upadte Details.html">Update Details</a>
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
                <a class="nav-link active" href="#">Account Details</a>
            </li>
        </ul>
        </div>
    </nav>
    <div class="container">
        <h1 style="text-align:center;margin-top: 50px;">Display Account Details</h1>

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
              <c:forEach var="account" items="${accounts}">
              <tr>
              	<td>${account.accountId}</td>
              	<td>${account.accountHolderName}</td>
              	<td>${account.accountType}</td>
              	<td>${account.accountBalance}</td>
              </tr>
              </c:forEach>
            </tbody>
          </table>
    </div>
</body>
</html>