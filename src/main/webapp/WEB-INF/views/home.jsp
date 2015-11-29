<%@include file="includes/head.jsp"%>

<!-- FALTA INCLUIR FOTO DE FONDO COMO EN PLANTILLA MIRAR CSS -->

<section id="contact">

	<!-- FORMULARIO INICIO SESION -->
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<form name="iniciosesion" id="iniciosesion">
					<div class="row">
						<div class="row">
							<div class="col-lg-12 text-center">
								<h2 class="section-heading">Inicia sesión</h2>
							</div>
						</div>
						<div class="col-lg-12 text-center">
							<div class="form-group">
								<input type="text" class="form-control" placeholder="Usuario"
									id="user">
								<p class="help-block text-danger"></p>
							</div>
							<div class="form-group">
								<input type="password" class="form-control"
									placeholder="Contraseña" id="pass">
								<p class="help-block text-danger"></p>
							</div>
							<div class="clearfix"></div>
							<div class="col-lg-12 text-center">
								<div id="success"></div>
								<button type="submit" class="btn btn-xl">Entrar</button>
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>

	<!-- ESPACIO ENTRE CONTAINERS -->
	<div class="row">
		<div class="col-lg-12 text-center">
			<h2 class="section-heading"></h2>
			<h3 class="section-subheading text-muted"></h3>
		</div>
	</div>

	<!-- FORMULARIO REGISTRO -->
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<form name="sentMessage" id="contactForm">
					<div class="row">
					
						<!-- REGISTRO CLIENTE -->
						<div class="col-md-6">
							<div class="row">
								<div class="col-lg-12 text-center">
									<h2 class="section-heading">Nuevo cliente</h2>
								</div>
							</div>
							<div class="form-group">
								<input type="text" class="form-control"
									placeholder="Usuario" id="user">
								<p class="help-block text-danger"></p>
							</div>
							<div class="form-group">
								<input type="password" class="form-control"
									placeholder="Contraseña" id="pass">
								<p class="help-block text-danger"></p>
							</div>
							<div class="form-group">
								<input type="text" class="form-control"
									placeholder="Nombre" id="nombre">
								<p class="help-block text-danger"></p>
							</div>
							<div class="form-group">
								<input type="text" class="form-control"
									placeholder="Apellidos" id="apellidos">
								<p class="help-block text-danger"></p>
							</div>
							<!-- FALTA examinar foto subir -->
							
							<div class="clearfix"></div>
							<div class="col-lg-12 text-center">
								<div id="success"></div>
								<button type="submit" class="btn btn-xl">Enviar</button>
							</div>
						</div>						
						
						<!-- REGISTRO EMPLEADO -->
						<div class="col-md-6">
							<div class="row">
								<div class="col-lg-12 text-center">
									<h2 class="section-heading">Nuevo empleado</h2>
								</div>
							</div>
							<div class="form-group">
								<input type="text" class="form-control"
									placeholder="Usuario" id="user">
								<p class="help-block text-danger"></p>
							</div>
							<div class="form-group">
								<input type="password" class="form-control"
									placeholder="Contraseña" id="pass">
								<p class="help-block text-danger"></p>
							</div>
							<div class="form-group">
								<input type="text" class="form-control"
									placeholder="Nombre" id="nombre">
								<p class="help-block text-danger"></p>
							</div>
							<div class="form-group">
								<input type="text" class="form-control"
									placeholder="Apellidos" id="apellidos">
								<p class="help-block text-danger"></p>
							</div>
							<!-- FALTA examinar foto subir -->
							
							<div class="clearfix"></div>
							<div class="col-lg-12 text-center">
								<div id="success"></div>
								<button type="submit" class="btn btn-xl">Enviar</button>
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</section>

<%@include file="includes/footer.jsp"%>

</html>
