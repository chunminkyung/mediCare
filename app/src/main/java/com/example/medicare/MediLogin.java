package com.example.medicare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MediLogin extends AppCompatActivity {
    //private FirebaseAuth firebaseAuth;
    //private FirebaseAuth.AuthStateListener firebaseAuthListener;
    private EditText editTextId;
    private EditText editTextPassword;
    private Button buttonLogin;
    private Button buttonJoin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medi_login);
        //firebaseAuth = FirebaseAuth.getInstance();


        editTextId = (EditText) findViewById(R.id.et_id);
        editTextPassword = (EditText) findViewById(R.id.et_pass);

        //회원가입 버튼
        buttonJoin = (Button) findViewById(R.id.btn_join);
        buttonJoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Join 연결
                Intent intent = new Intent(MediLogin.this, MediRegister.class);
                startActivity(intent);
            }
        });

        buttonLogin = (Button) findViewById(R.id.btn_login);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            /*
                if (!editTextId.getText().toString().equals("") && !editTextPassword.getText().toString().equals("")) {
                    loginUser(editTextId.getText().toString(), editTextPassword.getText().toString());
                } else {
                    Toast.makeText(MediLogin.this, "계정과 비밀번호를 입력하세요.", Toast.LENGTH_LONG).show();
                }
                */
                Intent intent = new Intent(MediLogin.this, MainMenuActivity.class);
                startActivity(intent);
                finish();

            }
        });

        /*
        firebaseAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null) {
                    Intent intent = new Intent(Login.this, MainMenuActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                }
            }
        };
        */
    }

    public void loginUser(String id, String password) {
        /*
            firebaseAuth.signInWithEmailAndPassword(id, password)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                // 로그인 성공
                                Toast.makeText(Login.this, "로그인 성공", Toast.LENGTH_SHORT).show();
                                firebaseAuth.addAuthStateListener(firebaseAuthListener);
                            } else {
                                // 로그인 실패
                                Toast.makeText(Login.this, "아이디 또는 비밀번호가 일치하지 않습니다.", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
*/
    }
}