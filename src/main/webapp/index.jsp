<html>
<body>
<h2>Dynatrace Continuous Delivery Demo</h2>
<%@ page import = "cdelivery_demo.*" %>

        <FORM NAME="CDdemoform" METHOD="POST">
            <INPUT TYPE="HIDDEN" NAME="buttonName">
            <INPUT TYPE="BUTTON" VALUE="Run DB Functions" ONCLICK="button1()">
            <INPUT TYPE="BUTTON" VALUE="Run Demo Problem1" ONCLICK="button2()">
			<INPUT TYPE="BUTTON" VALUE="Run Demo Web Services" ONCLICK="button3()">   
        </FORM>

        <SCRIPT LANGUAGE="JavaScript">
            <!--
            function button1()
            {
            	Excercise myExec;
            	
            	myExec.RunDemoDBFunctions();
                document.form1.buttonName.value = "button 1"
                form1.submit()
            }    
            function button2()
            {
            	Excercise myExec;
            	myExec.RunDemoProblem1();
                document.form1.buttonName.value = "button 2"
                form1.submit()
            }    
            function button3()
            {
            	Excercise myExec;
            	myExec.RunDemoWebServiceCalls();
            }
            // --> 
        </SCRIPT>
      </body>
</html>
