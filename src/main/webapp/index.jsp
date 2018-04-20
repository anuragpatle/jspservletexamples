
<html>
<body>
	<h2>Hello World!</h2>

	<form action="https://www.sandbox.paypal.com/cgi-bin/webscr" method="post">

		<!-- Identify your business so that you can collect the payments. -->
		<input type="hidden" name="business"
			value="anurag.ap6-facilitator@gmail.com">

		<!-- Specify a Donate button. -->
		<input type="hidden" name="cmd" value="_donations">

		<!-- Specify details about the contribution -->
		<input type="hidden" name="item_name" value="Securview">
		<input type="hidden" name="item_number" value="Fall Cleanup Campaign">
		<input type="hidden" name="currency_code" value="USD">

		<!-- Display the payment button. -->
		<input type="image" name="submit"
			src="https://www.paypalobjects.com/en_US/i/btn/btn_donate_LG.gif"
			alt="Donate"> <img alt="" width="1" height="1"
			src="https://www.paypalobjects.com/en_US/i/scr/pixel.gif">

	</form>


</body>
</html>
