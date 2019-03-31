
function hideFieldsOnNewCustomer(){
	
	document.getElementById ("newCustomerformId:nachnameLabelId").style.display ="none";
	document.getElementById ("newCustomerformId:nachnameId").style.display ="none";


	document.getElementById ("newCustomerformId:steuerNummerLabelId").style.display ="none";
	document.getElementById ("newCustomerformId:steuerNummerId").style.display ="none";

	document.getElementById ("newCustomerformId:gebDatumLabelId").style.display ="none";
	document.getElementById ("newCustomerformId:gebDatumInputId").style.display ="none";
	
	document.getElementById("newCustomerformId:createCustomerId").style.display ="none";
}

function enableFieldsOnNewCustomer(){
	var selectedKunde = document.getElementById ("newCustomerformId:kundeTypId");
	
	if (selectedKunde==null){
		return;
	}
	
	if (selectedKunde.value == 'TYP_NATPERS'){

		document.getElementById ("newCustomerformId:steuerNummerLabelId").style.display ="none";
		document.getElementById ("newCustomerformId:steuerNummerId").style.display ="none";
		
		document.getElementById ("newCustomerformId:nachnameLabelId").style.display ="display";
		document.getElementById ("newCustomerformId:nachnameId").style.display ="display";



		document.getElementById ("newCustomerformId:gebDatumLabelId").style.display ="block";
		document.getElementById ("newCustomerformId:gebDatumInputId").style.display ="block";
		
		document.getElementById("newCustomerformId:createCustomerId").style.display ="block";

	} else if (selectedKunde.value == 'TYP_FIRMA'){
		
		document.getElementById ("newCustomerformId:nachnameLabelId").style.display ="none";
		document.getElementById ("newCustomerformId:nachnameId").style.display ="none";
		
		document.getElementById ("newCustomerformId:steuerNummerLabelId").style.display ="block";
		document.getElementById ("newCustomerformId:steuerNummerId").style.display ="block";
		
		document.getElementById("newCustomerformId:createCustomerId").style.display ="block";
	} else {
	
		hideFieldsOnNewCustomer();
	}
	
}