<%@ page import="msse.User" %>



<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'username', 'error')} required">
	<label for="username">
		<g:message code="user.username.label" default="Username" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="username" required="" value="${userInstance?.username}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'fullName', 'error')} required">
	<label for="fullName">
		<g:message code="user.fullName.label" default="Full Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="fullName" required="" value="${userInstance?.fullName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'password', 'error')} required">
	<label for="password">
		<g:message code="user.password.label" default="Password" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="password" name="password" required="" value="${userInstance?.password}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'addressState', 'error')} required">
	<label for="addressState">
		<g:message code="user.addressState.label" default="Address State" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="addressState" from="${userInstance.constraints.addressState.inList}" required="" value="${userInstance?.addressState}" valueMessagePrefix="user.addressState"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'addressCity', 'error')} required">
	<label for="addressCity">
		<g:message code="user.addressCity.label" default="Address City" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="addressCity" required="" value="${userInstance?.addressCity}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'addressStreet', 'error')} required">
	<label for="addressStreet">
		<g:message code="user.addressStreet.label" default="Address Street" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="addressStreet" required="" value="${userInstance?.addressStreet}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'addressZip', 'error')} required">
	<label for="addressZip">
		<g:message code="user.addressZip.label" default="Address Zip" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="addressZip" required="" value="${userInstance?.addressZip}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'email', 'error')} required">
	<label for="email">
		<g:message code="user.email.label" default="Email" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="email" required="" value="${userInstance?.email}"/>

</div>

