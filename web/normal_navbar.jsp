<!-- All nav-bar code copied from bootstrap 4 website-->

<nav class="navbar navbar-expand-lg navbar-dark bg-dark primary-background">
    <a class="navbar-brand" href="index.jsp"><span class='fa fa-graduation-cap'></span> Sahil's Project</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
          <a class="nav-link" href="#"><span class='fa fa-institution'></span> Home <span class="sr-only">(current)</span></a>
      </li>
     
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <span class='fa fa-reorder'></span> Categories
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">Programming language</a>
          <a class="dropdown-item" href="#">Projects</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Data Structures</a>
        </div>
      </li>
       <li class="nav-item">
           <a class="nav-link" href="#"><span class='fa fa-phone-square'></span> Contact</a>
      </li>
       <li class="nav-item">
           <a class="nav-link" href="login_page.jsp"><span class='fa fa-user-circle'></span> Login</a>
      </li>
       <li class="nav-item">
           <a class="nav-link" href="register_page.jsp"><span class='fa fa-user-plus'></span> Sign up</a>
      </li>
    
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-light my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>