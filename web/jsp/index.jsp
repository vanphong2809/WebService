<%-- 
    Document   : index
    Created on : Oct 4, 2019, 8:58:08 PM
    Author     : MyPC
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html lang="zxx">
	<!-- head -->
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Moviepoint - Online Movie,Vedio and TV Show HTML Template</title>
		<link rel="icon" type="image/png" href="/WebService/jsp/image/favcion.png" />
		<link rel="stylesheet" type="text/css" href="/WebService/jsp/css/bootstrap.min.css" media="all" />
		<link rel="stylesheet" type="text/css" href="/WebService/jsp/css/slicknav.min.css" media="all" />
		<link rel="stylesheet" type="text/css" href="/WebService/jsp/css/icofont.css" media="all" />
		<link rel="stylesheet" type="text/css" href="/WebService/jsp/css/owl.carousel.css">
		<link rel="stylesheet" type="text/css" href="/WebService/jsp/css/magnific-popup.css">
		<link rel="stylesheet" type="text/css" href="/WebService/jsp/css/style.css" media="all" />
		<link rel="stylesheet" type="text/css" href="/WebService/jsp/css/responsive.css" media="all" />

	</head>
	<body>
		<!-- Page loader -->
	    <div id="preloader"></div>
		<!-- header section start -->
		<header class="header">
			<div class="container">
				<div class="header-area">
					<div class="logo">
						<a href="index.html"><img src="/WebService/jsp/image/logo.png" alt="logo" /></a>
					</div>
					<div class="header-right">
						<form action="#">
							<select>
								<option value="Movies">Movies</option>
								<option value="Movies">Movies</option>
								<option value="Movies">Movies</option>
							</select>
							<input type="text"/>
							<button><i class="icofont icofont-search"></i></button>
						</form>
						<ul>
							<li><a href="#">Welcome Guest!</a></li>
							<li><a class="login-popup" href="#">Login</a></li>
						</ul>
					</div>
					<div class="menu-area">
						<div class="responsive-menu"></div>
					    <div class="mainmenu">
                            <ul id="primary-menu">
                                <li><a class="active" href="index.html">Home</a></li>
                                <li><a href="movies.html">Movies</a></li>
                                <li><a href="celebrities.html">CelebritiesList</a></li>
                                <li><a href="top-movies.html">Top Movies</a></li>
                                <li><a href="blog.html">News</a></li>
								<li><a href="#">Pages <i class="icofont icofont-simple-down"></i></a>
									<ul>
										<li><a href="blog-details.html">Blog Details</a></li>
										<li><a href="movie-details.html">Movie Details</a></li>
									</ul>
								</li>
                                <li><a class="theme-btn" href="#"><i class="icofont icofont-ticket"></i> Tickets</a></li>
                            </ul>
					    </div>
					</div>
				</div>
			</div>
		</header>
		<div class="login-area">
			<div class="login-box">
				<a href="#"><i class="icofont icofont-close"></i></a>
				<h2>LOGIN</h2>
				<form action="#">
					<h6>USERNAME OR EMAIL ADDRESS</h6>
					<input type="text" />
					<h6>PASSWORD</h6>
					<input type="text" />
					<div class="login-remember">
						<input type="checkbox" />
						<span>Remember Me</span>
					</div>
					<div class="login-signup">
						<span>SIGNUP</span>
					</div>
					<a href="#" class="theme-btn">LOG IN</a>
					<span>Or Via Social</span>
					<div class="login-social">
						<a href="#"><i class="icofont icofont-social-facebook"></i></a>
						<a href="#"><i class="icofont icofont-social-twitter"></i></a>
						<a href="#"><i class="icofont icofont-social-linkedin"></i></a>
						<a href="#"><i class="icofont icofont-social-google-plus"></i></a>
						<a href="#"><i class="icofont icofont-camera"></i></a>
					</div>
				</form>
				
			</div>
		</div>
		<div class="buy-ticket">
			<div class="container">
				<div class="buy-ticket-area">
					<a href="#"><i class="icofont icofont-close"></i></a>
					<div class="row">
						<div class="col-lg-8">
							<div class="buy-ticket-box">
								<h4>Buy Tickets</h4>
								<h5>Seat</h5>
								<h6>Screen</h6>
								<div class="ticket-box-table">
									<table class="ticket-table-seat">
										<tr>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
										</tr>
										<tr>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
										</tr>
										<tr>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
										</tr>
										<tr>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
										</tr>
										<tr>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
										</tr>
									</table>
									<table>
										<tr>
											<td>1</td>
										</tr>
										<tr>
											<td>2</td>
										</tr>
										<tr>
											<td>3</td>
										</tr>
										<tr>
											<td>4</td>
										</tr>
										<tr>
											<td>5</td>
										</tr>
									</table>
									<table class="ticket-table-seat">
										<tr>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
										</tr>
										<tr>
											<td class="active">1</td>
											<td class="active">1</td>
											<td class="active">1</td>
											<td class="active">1</td>
											<td class="active">1</td>
											<td class="active">1</td>
											<td class="active">1</td>
										</tr>
										<tr>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
										</tr>
										<tr>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
										</tr>
										<tr>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
										</tr>
									</table>
									<table>
										<tr>
											<td>1</td>
										</tr>
										<tr>
											<td>2</td>
										</tr>
										<tr>
											<td>3</td>
										</tr>
										<tr>
											<td>4</td>
										</tr>
										<tr>
											<td>5</td>
										</tr>
									</table>
									<table class="ticket-table-seat">
										<tr>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
										</tr>
										<tr>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
										</tr>
										<tr>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
										</tr>
										<tr>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
										</tr>
										<tr>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
											<td>1</td>
										</tr>
									</table>
								</div>
								<div class="ticket-box-available">
									<input type="checkbox" />
									<span>Available</span>
									<input type="checkbox" checked />
									<span>Unavailable</span>
									<input type="checkbox" />
									<span>Selected</span>
								</div>
								<a href="#" class="theme-btn">previous</a>
								<a href="#" class="theme-btn">Next</a>
							</div>
						</div>
						<div class="col-lg-3 offset-lg-1">
							<div class="buy-ticket-box mtr-30">
								<h4>Your Information</h4>
								<ul>
									<li>
										<p>Location</p>
										<span>HB Cinema Box Corner</span>
									</li>
									<li>
										<p>TIME</p>
										<span>2018.07.09   20:40</span>
									</li>
									<li>
										<p>Movie name</p>
										<span>Home Alone</span>
									</li>
									<li>
										<p>Ticket number</p>
										<span>2 Adults, 2 Children, 2 Seniors</span>
									</li>
									<li>
										<p>Price</p>
										<span>89$</span>
									</li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div><!-- header section end -->
		<!-- hero area start -->
		<section class="hero-area" id="home">
			<div class="container">
				<div class="hero-area-slider">
					<div class="row hero-area-slide">
						<div class="col-lg-6 col-md-5">
							<div class="hero-area-content">
								<img src="/WebService/jsp/image/slide2.png" alt="about" />
							</div>
						</div>
						<div class="col-lg-6 col-md-7">
							<div class="hero-area-content pr-50">
								<h2>The Devil Princess</h2>
								
								<p>She is a devil princess from the demon world. She grew up sheltered by her parents and doesn't really know how to be evil or any of the common actions,   She is unable to cry due to Keita's accidental first wish, despite needed for him to wish...</p>
								<h3>Cast:</h3>
								<div class="slide-cast">
									<div class="single-slide-cast">
										<img src="/WebService/jsp/image/cast1.png" alt="about" />
									</div>
									<div class="single-slide-cast">
										<img src="/WebService/jsp/image/cast2.png" alt="about" />
									</div>
									<div class="single-slide-cast">
										<img src="/WebService/jsp/image/cast3.png" alt="about" />
									</div>
									<div class="single-slide-cast">
										<img src="/WebService/jsp/image/cast4.png" alt="about" />
									</div>
									<div class="single-slide-cast">
										<img src="/WebService/jsp/image/cast5.png" alt="about" />
									</div>
									<div class="single-slide-cast">
										<img src="/WebService/jsp/image/cast6.png" alt="about" />
									</div>
									<div class="single-slide-cast">
										<img src="/WebService/jsp/image/cast7.png" alt="about" />
									</div>
									<div class="single-slide-cast text-center">
										5+
									</div>
								</div>
								<div class="slide-trailor">
									<h3>Watch Trailer</h3>
									<a class="theme-btn theme-btn2" href="#"><i class="icofont icofont-play"></i> Tickets</a>
								</div>
							</div>
						</div>
					</div>
					<div class="row hero-area-slide">
						<div class="col-lg-6 col-md-5">
							<div class="hero-area-content">
								<img src="../jsp/image/slide1.png" alt="about" />
							</div>
						</div>
						<div class="col-lg-6 col-md-7">
							<div class="hero-area-content pr-50">
								<h2>Last Avatar</h2>
								
								<p>She is a devil princess from the demon world. She grew up sheltered by her parents and doesn't really know how to be evil or any of the common actions,   She is unable to cry due to Keita's accidental first wish, despite needed for him to wish...</p>
								<h3>Cast:</h3>
								<div class="slide-cast">
									<div class="single-slide-cast">
										<img src="/WebService/jsp/image/cast1.png" alt="about" />
									</div>
									<div class="single-slide-cast">
										<img src="/WebService/jsp/image/cast2.png" alt="about" />
									</div>
									<div class="single-slide-cast">
										<img src="/WebService/jsp/image/cast3.png" alt="about" />
									</div>
									<div class="single-slide-cast">
										<img src="/WebService/jsp/image/cast4.png" alt="about" />
									</div>
									<div class="single-slide-cast">
										<img src="/WebService/jsp/image/cast5.png" alt="about" />
									</div>
									<div class="single-slide-cast">
										<img src="/WebService/jsp/image/cast6.png" alt="about" />
									</div>
									<div class="single-slide-cast">
										<img src="/WebService/jsp/image/cast7.png" alt="about" />
									</div>
									<div class="single-slide-cast text-center">
										5+
									</div>
								</div>
								<div class="slide-trailor">
									<h3>Watch Trailer</h3>
									<a class="theme-btn theme-btn2" href="#"><i class="icofont icofont-play"></i> Tickets</a>
								</div>
							</div>
						</div>
					</div>
					<div class="row hero-area-slide">
						<div class="col-lg-6 col-md-5">
							<div class="hero-area-content">
								<img src="/WebService/jsp/image/slide3.png" alt="about" />
							</div>
						</div>
						<div class="col-lg-6 col-md-7">
							<div class="hero-area-content pr-50">
								<h2>The Deer God</h2>
								
								<p>She is a devil princess from the demon world. She grew up sheltered by her parents and doesn't really know how to be evil or any of the common actions,   She is unable to cry due to Keita's accidental first wish, despite needed for him to wish...</p>
								<h3>Cast:</h3>
								<div class="slide-cast">
									<div class="single-slide-cast">
										<img src="/WebService/jsp/image/cast1.png" alt="about" />
									</div>
									<div class="single-slide-cast">
										<img src="/WebService/jsp/image/cast2.png" alt="about" />
									</div>
									<div class="single-slide-cast">
										<img src="/WebService/jsp/image/cast3.png" alt="about" />
									</div>
									<div class="single-slide-cast">
										<img src="/WebService/jsp/image/cast4.png" alt="about" />
									</div>
									<div class="single-slide-cast">
										<img src="/WebService/jsp/image/cast5.png" alt="about" />
									</div>
									<div class="single-slide-cast">
										<img src="/WebService/jsp/image/cast6.png" alt="about" />
									</div>
									<div class="single-slide-cast">
										<img src="/WebService/jsp/image/cast7.png" alt="about" />
									</div>
									<div class="single-slide-cast text-center">
										5+
									</div>
								</div>
								<div class="slide-trailor">
									<h3>Watch Trailer</h3>
									<a class="theme-btn theme-btn2" href="#"><i class="icofont icofont-play"></i> Tickets</a>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="hero-area-thumb">
					<div class="thumb-prev">
						<div class="row hero-area-slide">
							<div class="col-lg-6">
								<div class="hero-area-content">
									<img src="/WebService/jsp/image/slide3.png" alt="about" />
								</div>
							</div>
							<div class="col-lg-6">
								<div class="hero-area-content pr-50">
									<h2>Last Avatar</h2>
									<p>She is a devil princess from the demon world. She grew up sheltered by her parents and doesn't really know how to be evil or any of the common actions,   She is unable to cry due to Keita's accidental first wish, despite needed for him to wish...</p>
									<h3>Cast:</h3>
									<div class="slide-cast">
										<div class="single-slide-cast">
											<img src="/WebService/jsp/image/cast1.png" alt="about" />
										</div>
										<div class="single-slide-cast">
											<img src="/WebService/jsp/image/cast2.png" alt="about" />
										</div>
										<div class="single-slide-cast">
											<img src="/WebService/jsp/image/cast3.png" alt="about" />
										</div>
										<div class="single-slide-cast">
											<img src="/WebService/jsp/image/cast4.png" alt="about" />
										</div>
										<div class="single-slide-cast">
											<img src="/WebService/jsp/image/cast5.png" alt="about" />
										</div>
										<div class="single-slide-cast">
											<img src="/WebService/jsp/image/cast6.png" alt="about" />
										</div>
										<div class="single-slide-cast">
											<img src="/WebService/jsp/image/cast7.png" alt="about" />
										</div>
										<div class="single-slide-cast text-center">
											5+
										</div>
									</div>
									<div class="slide-trailor">
										<h3>Watch Trailer</h3>
										<a class="theme-btn theme-btn2" href="#"><i class="icofont icofont-play"></i> Tickets</a>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="thumb-next">
						<div class="row hero-area-slide">
							<div class="col-lg-6">
								<div class="hero-area-content">
									<img src="/WebService/jsp/image/slide1.png" alt="about" />
								</div>
							</div>
							<div class="col-lg-6">
								<div class="hero-area-content pr-50">
									<h2>The Deer God</h2>
									
									<p>She is a devil princess from the demon world. She grew up sheltered by her parents and doesn't really know how to be evil or any of the common actions,   She is unable to cry due to Keita's accidental first wish, despite needed for him to wish...</p>
									<h3>Cast:</h3>
									<div class="slide-cast">
										<div class="single-slide-cast">
											<img src="/WebService/jsp/image/cast1.png" alt="about" />
										</div>
										<div class="single-slide-cast">
											<img src="/WebService/jsp/image/cast2.png" alt="about" />
										</div>
										<div class="single-slide-cast">
											<img src="/WebService/jsp/image/cast3.png" alt="about" />
										</div>
										<div class="single-slide-cast">
											<img src="/WebService/jsp/image/cast4.png" alt="about" />
										</div>
										<div class="single-slide-cast">
											<img src="/WebService/jsp/image/cast5.png" alt="about" />
										</div>
										<div class="single-slide-cast">
											<img src="/WebService/jsp/image/cast6.png" alt="about" />
										</div>
										<div class="single-slide-cast">
											<img src="/WebService/jsp/image/cast7.png" alt="about" />
										</div>
										<div class="single-slide-cast text-center">
											5+
										</div>
									</div>
									<div class="slide-trailor">
										<h3>Watch Trailer</h3>
										<a class="theme-btn theme-btn2" href="#"><i class="icofont icofont-play"></i> Tickets</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section><!-- hero area end -->
		<!-- portfolio section start -->
		<section class="portfolio-area pt-60">
			<div class="container">
				<div class="row flexbox-center">
					<div class="col-lg-6 text-center text-lg-left">
					    <div class="section-title">
							<h1><i class="icofont icofont-movie"></i> Spotlight This Month</h1>
						</div>
					</div>
					<div class="col-lg-6 text-center text-lg-right">
					    <div class="portfolio-menu">
							<ul>
								<li data-filter="*" class="active">Latest</li>
								<li data-filter=".soon">Comming Soon</li>
								<li data-filter=".top">Top Rated</li>
								<li data-filter=".released">Recently Released</li>
							</ul>
						</div>
					</div>
				</div>
				<hr />
				<div class="row">
					<div class="col-lg-9">
						<div class="row portfolio-item">
                                                    <c:forEach items="${listMovie}" var="list">
                                                        <div class="col-md-4 col-sm-6 soon released">
								<div class="single-portfolio">
									<div class="single-portfolio-img">
										<img src="/WebService/jsp/image/portfolio1.png" alt="portfolio" />
										<a href="https://www.youtube.com/watch?v=RZXnugbhw_4" class="popup-youtube">
											<i class="icofont icofont-ui-play"></i>
										</a>
									</div>
									<div class="portfolio-content">
										<a href="movie-details.html">
											<h2>${list.movieName}</h2>
										</a>
										
									</div>
								</div>
							</div>
                                                    </c:forEach>
							
							<div class="col-md-4 col-sm-6 top">
								<div class="single-portfolio">
									<div class="single-portfolio-img">
										<img src="/WebService/jsp/image/portfolio2.png" alt="portfolio" />
										<a href="https://www.youtube.com/watch?v=RZXnugbhw_4" class="popup-youtube">
											<i class="icofont icofont-ui-play"></i>
										</a>
									</div>
									<div class="portfolio-content">
										<h2>Tale of Revemge</h2>
										
									</div>
								</div>
							</div>
							<div class="col-md-4 col-sm-6 soon">
								<div class="single-portfolio">
									<div class="single-portfolio-img">
										<img src="/WebService/jsp/image/portfolio3.png" alt="portfolio" />
										<a href="https://www.youtube.com/watch?v=RZXnugbhw_4" class="popup-youtube">
											<i class="icofont icofont-ui-play"></i>
										</a>
									</div>
									<div class="portfolio-content">
										<h2>The Lost City of Z</h2>
										
									</div>
								</div>
							</div>
							<div class="col-md-4 col-sm-6 top released">
								<div class="single-portfolio">
									<div class="single-portfolio-img">
										<img src="/WebService/jsp/image/portfolio4.png" alt="portfolio" />
										<a href="https://www.youtube.com/watch?v=RZXnugbhw_4" class="popup-youtube">
											<i class="icofont icofont-ui-play"></i>
										</a>
									</div>
									<div class="portfolio-content">
										<h2>Beast Beauty</h2>
										
									</div>
								</div>
							</div>
							<div class="col-md-4 col-sm-6 released">
								<div class="single-portfolio">
									<div class="single-portfolio-img">
										<img src="/WebService/jsp/image/portfolio5.png" alt="portfolio" />
										<a href="https://www.youtube.com/watch?v=RZXnugbhw_4" class="popup-youtube">
											<i class="icofont icofont-ui-play"></i>
										</a>
									</div>
									<div class="portfolio-content">
										<h2>In The Fade</h2>
										
									</div>
								</div>
							</div>
							<div class="col-md-4 col-sm-6 soon top">
								<div class="single-portfolio">
									<div class="single-portfolio-img">
										<img src="/WebService/jsp/image/portfolio6.png" alt="portfolio" />
										<a href="https://www.youtube.com/watch?v=RZXnugbhw_4" class="popup-youtube">
											<i class="icofont icofont-ui-play"></i>
										</a>
									</div>
									<div class="portfolio-content">
										<h2>Last Hero</h2>
										
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-lg-3 text-center text-lg-left">
					    <div class="portfolio-sidebar">
							<img src="/WebService/jsp/image/sidebar1.png" alt="sidebar" />
							<img src="/WebService/jsp/image/sidebar2.png" alt="sidebar" />
							<img src="/WebService/jsp/image/sidebar3.png" alt="sidebar" />
							<img src="/WebService/jsp/image/sidebar4.png" alt="sidebar" />
						</div>
					</div>
				</div>
			</div>
		</section><!-- portfolio section end -->
		<!-- video section start -->
		<section class="video ptb-90">
			<div class="container">
				<div class="row">
					<div class="col-lg-12">
					    <div class="section-title pb-20">
							<h1><i class="icofont icofont-film"></i> Trailers & Videos</h1>
						</div>
					</div>
				</div>
				<hr />
				<div class="row">
                    <div class="col-md-9">
						<div class="video-area">
							<img src="/WebService/jsp/image/video1.png" alt="video" />
							<a href="https://www.youtube.com/watch?v=RZXnugbhw_4" class="popup-youtube">
								<i class="icofont icofont-ui-play"></i>
							</a>
							<div class="video-text">
								<h2>Angle of Death</h2>
								
							</div>
						</div>
                    </div>
                    <div class="col-md-3">
						<div class="row">
							<div class="col-md-12 col-sm-6">
								<div class="video-area">
									<img src="/WebService/jsp/image/video2.png" alt="video" />
									<a href="https://www.youtube.com/watch?v=RZXnugbhw_4" class="popup-youtube">
										<i class="icofont icofont-ui-play"></i>
									</a>
								</div>
							</div>
							<div class="col-md-12 col-sm-6">
								<div class="video-area">
									<img src="/WebService/jsp/image/video3.png" alt="video" />
									<a href="https://www.youtube.com/watch?v=RZXnugbhw_4" class="popup-youtube">
										<i class="icofont icofont-ui-play"></i>
									</a>
								</div>
							</div>
						</div>
                    </div>
				</div>
			</div>
		</section><!-- video section end -->
		<!-- news section start -->
		<section class="news">
			<div class="container">
				<div class="row">
					<div class="col-lg-12">
					    <div class="section-title pb-20">
							<h1><i class="icofont icofont-coffee-cup"></i> Latest News</h1>
						</div>
					</div>
				</div>
				<hr />
			</div>
			<div class="news-slide-area">
				<div class="news-slider">
					<div class="single-news">
						<div class="news-bg-1"></div>
						<div class="news-date">
							<h2><span>NOV</span> 25</h2>
							<h1>2017</h1>
						</div>
						<div class="news-content">
							<h2>The Witch Queen</h2>
							<p>Witch Queen is a tall woman with a slim build. She has pink hair, which is pulled up under her hat, and teal eyes.</p>
						</div>
						<a href="#">Read More</a>
					</div>
					<div class="single-news">
						<div class="news-bg-2"></div>
						<div class="news-date">
							<h2><span>NOV</span> 25</h2>
							<h1>2017</h1>
						</div>
						<div class="news-content">
							<h2>The Witch Queen</h2>
							<p>Witch Queen is a tall woman with a slim build. She has pink hair, which is pulled up under her hat, and teal eyes.</p>
						</div>
						<a href="#">Read More</a>
					</div>
					<div class="single-news">
						<div class="news-bg-3"></div>
						<div class="news-date">
							<h2><span>NOV</span> 25</h2>
							<h1>2017</h1>
						</div>
						<div class="news-content">
							<h2>The Witch Queen</h2>
							<p>Witch Queen is a tall woman with a slim build. She has pink hair, which is pulled up under her hat, and teal eyes.</p>
						</div>
						<a href="#">Read More</a>
					</div>
				</div>
				<div class="news-thumb">
					<div class="news-next">
						<div class="single-news">
							<div class="news-bg-3"></div>
							<div class="news-date">
								<h2><span>NOV</span> 25</h2>
								<h1>2017</h1>
							</div>
							<div class="news-content">
								<h2>The Witch Queen</h2>
								<p>Witch Queen is a tall woman with a slim build. She has pink hair, which is pulled up under her hat, and teal eyes.</p>
							</div>
							<a href="#">Read More</a>
						</div>
					</div>
					<div class="news-prev">
						<div class="single-news">
							<div class="news-bg-2"></div>
							<div class="news-date">
								<h2><span>NOV</span> 25</h2>
								<h1>2017</h1>
							</div>
							<div class="news-content">
								<h2>The Witch Queen</h2>
								<p>Witch Queen is a tall woman with a slim build. She has pink hair, which is pulled up under her hat, and teal eyes.</p>
							</div>
							<a href="#">Read More</a>
						</div>
					</div>
				</div>
			</div>
		</section><!-- news section end -->
		<!-- footer section start -->
		<footer class="footer">
			<div class="container">
				<div class="row">
                    <div class="col-lg-3 col-sm-6">
						<div class="widget">
							<img src="/WebService/jsp/image/logo.png" alt="about" />
							<p>7th Harley Place, London W1G 8LZ United Kingdom</p>
							<h6><span>Call us: </span>(+880) 111 222 3456</h6>
						</div>
                    </div>
                    <div class="col-lg-3 col-sm-6">
						<div class="widget">
							<h4>Legal</h4>
							<ul>
								<li><a href="#">Terms of Use</a></li>
								<li><a href="#">Privacy Policy</a></li>
								<li><a href="#">Security</a></li>
							</ul>
						</div>
                    </div>
                    <div class="col-lg-3 col-sm-6">
						<div class="widget">
							<h4>Account</h4>
							<ul>
								<li><a href="#">My Account</a></li>
								<li><a href="#">Watchlist</a></li>
								<li><a href="#">Collections</a></li>
								<li><a href="#">User Guide</a></li>
							</ul>
						</div>
                    </div>
                    <div class="col-lg-3 col-sm-6">
						<div class="widget">
							<h4>Newsletter</h4>
							<p>Subscribe to our newsletter system now to get latest news from us.</p>
							<form action="#">
								<input type="text" placeholder="Enter your email/WebService"/>
								<button>SUBSCRIBE NOW</button>
							</form>
						</div>
                    </div>
				</div>
				<hr />
			</div>
			<div class="copyright">
				<div class="container">
					<div class="row">
						<div class="col-lg-6 text-center text-lg-left">
							<div class="copyright-content">
								<p>&copy; 2018 MoviePoint. All Rights Reserved. Designed by themerocket</p>
							</div>
						</div>
						<div class="col-lg-6 text-center text-lg-right">
							<div class="copyright-content">
								<a href="#" class="scrollToTop">
									Back to top<i class="icofont icofont-arrow-up"></i>
								</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</footer>
		<!-- footer section end -->
		<!-- jquery main JS -->
		<script src="/WebService/jsp/js/jquery.min.js"></script>
		<!-- Bootstrap JS -->
		<script src="/WebService/jsp/js/bootstrap.min.js"></script>
		<!-- Slick nav JS -->
		<script src="/WebService/jsp/js/jquery.slicknav.min.js"></script>
		<!-- owl carousel JS -->
		<script src="/WebService/jsp/js/owl.carousel.min.js"></script>
		<!-- Popup JS -->
		<script src="/WebService/jsp/js/jquery.magnific-popup.min.js"></script>
		<!-- Isotope JS -->
		<script src="/WebService/jsp/js/isotope.pkgd.min.js"></script>
		<!-- main JS -->
		<script src="/WebService/jsp/js/main.js"></script>
	</body>
</html>
