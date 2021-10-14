# Login_App
**Implement Login in Android App.** 



<img src="app/src/main/res/mipmap-xhdpi/ic_launcher_round.png" align="left"
width="100"
    hspace="10" vspace="10">

This is the application fro login and check the username and password and redirect to home page simply.
<br>

## Preview
<img src="/Screenshot/2.jpg" width="300"  align="left">
<img src="/Screenshot/1.jpg" width="300" align="left">
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>

User_name: abcd@gmail.com
Password: 1234

## Implementation
Now the login is based on `Onclick()` public method. This method will help us to check the username and password then redirect to home page else not.

```@Override
            public void onClick(View v) {

                stringEmail = etEmail.getText().toString();
                stringPassword = etPassword.getText().toString();
                stringUserName = etUserName.getText().toString();

                if(stringEmail.equals("abcd@gmail.com")  && stringPassword.equals("1234")){
//                    Toast.makeText(MainActivity.this,"Login Success",Toast.LENGTH_SHORT).show();
                    Intent myMovingIndent = new Intent(MainActivity.this,ActivityHome.class);

                    myMovingIndent.putExtra("myKey",stringEmail);
                    myMovingIndent.putExtra("myKey2",stringUserName);

                    startActivity(myMovingIndent);

                }
                else {

                    Toast.makeText(MainActivity.this,"Login Failed",Toast.LENGTH_SHORT).show();
                }
            }
```


## Follow me
<h4>Hey, while you're here why don't you think of following me for awesome projects like this, ah? <a href="https://github.com/ankit-p-chandran">Follow Me on my Profile!</a></h4>

<br>
Lets grab code with chai.

