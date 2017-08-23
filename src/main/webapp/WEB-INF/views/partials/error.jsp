<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:if test="${message}">
	<div class="row centered-form">
		<div
			class="col-xs-12 col-sm-8 col-md-6 col-lg-4  col-sm-offset-2 col-md-offset-3 col-lg-offset-4">
			<div class="alert alert-success fade in">
				<a href="#" class="close" data-dismiss="alert" aria-label="close">X</a>
				<strong>${value}</strong>
			</div>
		</div>
	</div>
</c:if>