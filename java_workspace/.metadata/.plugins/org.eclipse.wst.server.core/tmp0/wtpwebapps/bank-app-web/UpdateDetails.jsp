<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Deposit Amount</title>
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
                <a class="nav-link active" href="#">New Account</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="Withdraw.html">Withdraw Amount</a>
            </li>
            <li class="nav-item">
                <a class="nav-link " href="Deposit Amount.html">Deposit Amount</a>
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
                <a class="nav-link" href="Display Details.html">Account Details</a>
            </li>
        </ul>
        </div>
    </nav>
    <div class="container">
    <h1 style="text-align:center;">Create New Account</h1>
      <div class="layout">
    <form action = "UpdateDetails.do" method = "post">
    		<div class="form-group row">
                <div class="col-sm-3"></div>
              <label for="" class="col-sm-3 col-form-label">Account Id :</label>
              <div class="col-sm-5">
                <input type="text" class="form-control" id="" value="${accounts.accountId}" placeholder="" name = "account_id" required readonly>
              </div>
            </div>
            <div class="form-group row">
                <div class="col-sm-3"></div>
              <label for="" class="col-sm-3 col-form-label">Account Holder Name :</label>
              <div class="col-sm-5">
                <input type="text" class="form-control" id="" value= "${accounts.accountHolderName}" placeholder="" name = "account_holder_name"required>
              </div>
            </div>
            <div class="form-group row">
                <div class="col-sm-3"></div>
              <label for="amt" class="col-sm-3 col-form-label"> Account Type :</label>
              <div class="col-sm-5">
                  <select id="" class="form-control" value ="${accounts.accountType}" name= "account_type" required>
                      <option value="">Choose...</option>
                      <option value = "SAVING">Saving</option>
                      <option value = "CURRENT">Current</option>
                    </select>
              </div>
            </div>
            <div class="form-group row">
                <div class="col-sm-3"></div>
              <label for="amt" class="col-sm-3 col-form-label"> Account Balance :</label>
              <div class="col-sm-5">
                <input type="number" class="form-control" id="amt" value= "${accounts.accountBalance}" name= "account_balance" readonly placeholder="" required>
              </div>
            </div>
            <div class="form-group row">
                <div class="col-sm-3"></div>
              <div class="col-sm-5">
                <button type="submit" class="btn btn-primary">Create</button>
              </div>
            </div>
          </form>
        </div>
</div>
</body>
</html>