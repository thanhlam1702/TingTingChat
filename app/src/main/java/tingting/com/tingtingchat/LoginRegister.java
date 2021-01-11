package tingting.com.tingtingchat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginRegister extends AppCompatActivity {

    private Button btnLogin, btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_register);

        btnLogin = (Button) findViewById(R.id.login);
        btnRegister = (Button) findViewById(R.id.register);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginRegister.this, LoginActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginRegister.this, Register.class);
                startActivity(intent);
                finish();
                return;
            }
        });
    }
}