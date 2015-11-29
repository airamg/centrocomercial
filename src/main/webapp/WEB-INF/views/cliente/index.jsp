<%@page import="mmm.comercial.centro.pojo.Cliente"%>
<%@page import="java.util.List"%>
<%@include file="../includes/head.jsp"%>
<%@include file="../includes/nav.jsp"%>

<section id="portfolio" class="bg-light-gray">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 text-center">
				<h2 class="section-heading">Listado de prueba</h2>
				<h3 class="section-subheading text-muted">()CAMBIAR A TIENDAS)</h3>
			</div>
		</div>
		<div class="row">
		
		<% List<Cliente> lista = (List<Cliente>) request.getAttribute("listClients");
				for (Cliente cli : lista) {
			%>
			<div class="col-md-4 col-sm-6 portfolio-item">
				<a href="#portfolioModal1" class="portfolio-link"
					data-toggle="modal">
					<div class="portfolio-hover">
						<div class="portfolio-hover-content">
							<i class="fa fa-plus fa-3x"></i>
						</div>
					</div> <img src="" class="img-responsive" alt="">
				</a>
				<div class="portfolio-caption">
					<h4><%=cli.getNombre() %></h4>
					<p class="text-muted"><%=cli.getApellidos() %></p>
				</div>
			</div>
 			<% }%>
		</div>
	</div>
</section>

<%@include file="../includes/footer.jsp"%>

</html>

