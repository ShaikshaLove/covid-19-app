<!DOCTYPE html>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
  <title>Covid-19</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

<link href="https://fonts.googleapis.com/css?family=Gotu&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Baloo+Thambi+2|Prompt&display=swap" rel="stylesheet"> <body style="height:1000px">

 <nav style="background-color:purple"  class="navbar fixed-top navbar-dark ">
      <a class="text-light navbar-brand">Covid-19</a>
       <a class="form-inline">
         <button class="btn btn-outline-warning btn-sm my-2 my-sm-0"  data-toggle="modal" data-target="#staticBackdrop">Join With Us</button>
      </a>
 </nav>

<div class="container-sm"><br><br><br>

<div class="border border-danger rounded-pill">
       <marquee scrollamount="3" style="font-family: 'Prompt', sans-serif;"class="text-success">Join with us to bury the covid-19</marquee>
</div>
<br>
<div>
   <p style="font-family: 'Baloo Thambi 2', cursive;"class="text-center">Being terrified of covid-19 does let you enormously responsible and I'm pretty sure that you'll not be reckless</p>

</div>
<c:if test="${message ne null }">
<div   class="alert alert-success text-center alert-dismissible fade show" role="alert">
  <strong class="text=center">${message}</strong> 
  <button type="button" class="close" data-dismiss="alert" aria-label="Close">
    <span aria-hidden="true">&times;</span>
  </button>
</div></c:if>

<br>
  <h5 class="text-center text-dark">All worldwide Covid Info</h5>
      <div class="jumbotron">      
    <table class="table table-bordered ">
    <tbody>
      <tr>
        <td class="text-center font-weight-bold ">The total identified sufferers</td>
        <td>${covid.cases}</td></tr>
        <tr>
        <td class="text-center font-weight-bold ">Recovered sufferers </td>
        <td>${covid.recovered}</td></tr>
        <tr><td class="text-center font-weight-bold ">The total deaths</td>
        <td>${covid.deaths}</td>
      </tr>
     
    </tbody>
  </table>
  </div>
  

  <h5 class="text-center font-weight-bold text-info">The real information till now-India</h5>
 
   <table class="table table-bordered ">
    <tbody>
      <tr>
        <td class="text-center font-weight-bold ">The toal identified sufferers</td>
        <td class="text-danger">${covidInfo.cases}</td></tr>
        <tr>
        <td class="text-center font-weight-bold ">recovered sufferers</td>
        <td class="text-danger">${covidInfo.recovered}</td></tr>
        <tr><td class="text-center font-weight-bold ">Deaths</td>
        <td class="text-danger">${covidInfo.deaths}</td>
      </tr>
      
 
      
      <tr><td class="text-center font-weight-bold ">identified cases today</td>
        <td class="text-danger">${covidInfo.todayCases}</td>
      </tr>
      
           <tr><td class="text-center font-weight-bold ">todat deaths </td>
        <td class="text-danger">${covidInfo.todayDeaths}</td>
      </tr>
      
      <tr><td class="text-center font-weight-bold ">Active Cases </td>
        <td class="text-danger">${covidInfo.active}</td>
      </tr>
     
    </tbody>
  </table>
  
  
</div>

 <nav class="navbar fixed-bottom navbar-dark bg-light">
  <span  class="text-dark">Designed and developed by <a href="https://www.facebook.com/shaiksha.sha.505" class="text-danger">shaiksha sayyad</a></span>
</nav>

<!-- <nav class="navbar navbar-sm bg-dark navbar-dark fixed-bottom">
  <p class="text-light">Designed and developed by shaiksha sayyad</p>
</nav>  -->


<div class="modal fade" id="staticBackdrop" data-backdrop="static" tabindex="-1" role="dialog" aria-labelledby="staticBackdropLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h6 class="modal-title" id="staticBackdropLabel">News letter about Covid-19</h6>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        
  <form:form action="./subscribe" method="post" modelAttribute="subscriber">
  
  <div class="form-group">
    <label for="exampleInputPassword1">Full Name</label>
    <form:input class="form-control" path="fullName"/>
  </div>
  
    <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
     <form:input  class="form-control" path="email"/>
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
   <div class="form-group">
    <label for="exampleInputPassword1">Feedback/Advice/Opinion</label>
    <form:textarea class="form-control" path="opinion"/>  </div>
 
  <button type="submit" class="btn btn-primary">Subscribe</button>
</form:form>


      </div>
     
    </div>
  </div>
</div>


</body>
</html>


