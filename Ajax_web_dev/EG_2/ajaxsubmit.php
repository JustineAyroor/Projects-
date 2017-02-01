 <?php
	//$connection = mysql_connect("localhost", "root", ""); // Establishing Connection with Server..
	//$db = mysql_select_db("mydba", $connection); // Selecting Database
	//Fetching Values from URL
        function executeQuery($query)
		{	//$pdo = connect();
			$pdo = new PDO('mysql:host=localhost:3306;dbname=test-ecom','root','');
			$selectQuery = $pdo->prepare($query);
			$selectQuery->execute();
			$queryResult = $selectQuery->fetch(PDO::FETCH_ASSOC);
			return $queryResult;
		}

/*		function connect()
		{
			try 
			{
				return new PDO('mysql:host=localhost:3306;dbname=test-ecom','root','');
			}
			catch (PDOException $e)
			{
				die('cannot connect to database');
			}
		}*/
	$name2=$_POST['name1'];
	$email2=$_POST['email1'];
	$password2=$_POST['password1'];
	$contact2=$_POST['contact1'];
	//Insert query
	$query = "insert into form_submissions(name, email, password, contact) values ('$name2', '$email2', '$password2','$contact2')";
	executeQuery($query);
	echo "Form Submitted Succesfully";
	//mysql_close($connection); // Connection Closed
?>