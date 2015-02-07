<%@ page import="msse.Auction" %>



<div class="fieldcontain ${hasErrors(bean: auctionInstance, field: 'owner', 'error')} required">
	<label for="owner">
		<g:message code="auction.owner.label" default="Owner" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="owner" name="owner.id" from="${msse.User.list()}" optionKey="id" required="" value="${auctionInstance?.owner?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: auctionInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="auction.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${auctionInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: auctionInstance, field: 'description', 'error')} required">
	<label for="description">
		<g:message code="auction.description.label" default="Description" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="description" required="" value="${auctionInstance?.description}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: auctionInstance, field: 'begDate', 'error')} required">
	<label for="begDate">
		<g:message code="auction.begDate.label" default="Beg Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="begDate" precision="day"  value="${auctionInstance?.begDate}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: auctionInstance, field: 'endDate', 'error')} required">
	<label for="endDate">
		<g:message code="auction.endDate.label" default="End Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="endDate" precision="day"  value="${auctionInstance?.endDate}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: auctionInstance, field: 'minAmount', 'error')} required">
	<label for="minAmount">
		<g:message code="auction.minAmount.label" default="Min Amount" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="minAmount" required="" value="${auctionInstance?.minAmount}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: auctionInstance, field: 'buyAmount', 'error')} required">
	<label for="buyAmount">
		<g:message code="auction.buyAmount.label" default="Buy Amount" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="buyAmount" required="" value="${auctionInstance?.buyAmount}"/>

</div>

