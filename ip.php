<?php
$remote_address = $_SERVER['REMOTE_ADDR'];
$http_client_ip = $_SERVER['HTTP_CLIENT_IP'];
$http_x_forwared_for = $_SERVER['HTTP_X_FORWARDED_FOR'];

if(!empty($http_client_ip))
{
	$ip_address = $http_client_ip;
}
else if(!empty($http_x_forwared_for))
{
	$ip_address = $http_x_forwared_for;
}
else
{
  $ip_address = $remote_address;	
}
echo "The remote ip address is" .$ip_address;
?>
<form method="POST" action="ip.php">
<label> Enter the website </label>
<input type="text" name="site"/>
<input type="submit" name="submit" value="search"/>
<?php
if(isset($_POST["submit"]))
{

  $site = $_POST["site"];
  echo "ip address of" .$site. "is" .gethostbyname($site);

}
?>
