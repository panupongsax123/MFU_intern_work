<?php
include_once("database.php");
$postdata = file_get_contents("php://input");
if(isset($postdata) && !empty($postdata))
{
$request = json_decode($postdata);
$nick = trim($request->nickname);
$email = trim($request->email);
$pwd = mysqli_real_escape_string($mysqli, trim($request->password));
$user = mysqli_real_escape_string($mysqli, trim($request->username));
$sql = "INSERT INTO register(username,nickname,password,email) VALUES ('$user','$nick','$pwd','$email')";
if ($mysqli->query($sql) === TRUE) {
$authdata = [
'username' => $user,
'nickname' => $nick,
'password' => '',
'email' => $email,
'id' => mysqli_insert_id($mysqli)
];
echo json_encode($authdata);
}
}

?>