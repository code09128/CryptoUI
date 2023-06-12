# CryptoUI
design crypto ui demo

### design demo UI

## Login
```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/purple"
    tools:context=".view.LoginActivity">

    <TextView
        android:id="@+id/textView3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Log in"
        android:textSize="50sp"
        android:textColor="@color/white"
        android:layout_marginStart="32dp"
        android:layout_marginTop="120dp"
        android:textStyle="bold"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">
    </TextView>

    <TextView
        android:id="@+id/textView4"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="20sp"
        android:text="Username"
        android:layout_marginTop="32dp"
        android:textColor="@color/white"
        android:textStyle="bold"
        app:layout_constraintStart_toStartOf="@id/textView3"
        app:layout_constraintTop_toBottomOf="@id/textView3">
    </TextView>

    <EditText
        android:id="@+id/editTextPersonName"
        android:layout_width="0dp"
        android:layout_height="50dp"
        android:background="@drawable/edittext_background"
        android:textSize="20sp"
        android:textColor="#707070"
        android:padding="8dp"
        android:ems="10"
        android:inputType="textPersonName"
        android:layout_marginTop="32dp"
        android:layout_marginEnd="32dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="@id/textView4"
        app:layout_constraintTop_toBottomOf="@id/textView4">
    </EditText>

    <TextView
        android:id="@+id/textView5"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Password"
        android:textSize="20sp"
        android:layout_marginTop="32dp"
        android:textStyle="bold"
        android:textColor="@color/white"
        app:layout_constraintStart_toStartOf="@+id/editTextPersonName"
        app:layout_constraintTop_toBottomOf="@+id/editTextPersonName" />

    <EditText
        android:id="@+id/editTextPassword"
        android:layout_width="0dp"
        android:layout_height="50dp"
        android:background="@drawable/edittext_background"
        android:textSize="20sp"
        android:textColor="#707070"
        android:padding="8dp"
        android:ems="10"
        android:inputType="textPassword"
        android:layout_marginTop="32dp"
        android:layout_marginEnd="32dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="@id/textView4"
        app:layout_constraintTop_toBottomOf="@id/textView5">
    </EditText>

    <TextView
        android:id="@+id/textView6"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Forget Your Password"
        android:textColor="@color/white"
        android:layout_marginTop="16dp"
        android:textSize="16sp"
        app:layout_constraintEnd_toEndOf="@+id/editTextPassword"
        app:layout_constraintStart_toStartOf="@+id/editTextPassword"
        app:layout_constraintTop_toBottomOf="@+id/editTextPassword" />

    <Button
        android:id="@+id/button"
        android:layout_width="0dp"
        android:layout_height="50dp"
        android:text="Login"
        android:textSize="20sp"
        android:textStyle="bold"
        style="@android:style/Widget.Button"
        android:background="@drawable/button_background"
        android:layout_marginTop="64dp"
        android:textColor="@color/white"
        app:layout_constraintEnd_toEndOf="@+id/editTextPassword"
        app:layout_constraintStart_toStartOf="@+id/editTextPassword"
        app:layout_constraintTop_toBottomOf="@+id/textView6" />

    <TextView
        android:id="@+id/textView7"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Dont have an account"
        android:textSize="16sp"
        android:textColor="@color/white"
        android:layout_marginTop="32dp"
        app:layout_constraintEnd_toEndOf="@+id/button"
        app:layout_constraintStart_toStartOf="@+id/button"
        app:layout_constraintTop_toBottomOf="@+id/button" />

    <TextView
        android:id="@+id/textView8"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Register now"
        android:textStyle="bold"
        android:textSize="16sp"
        android:textColor="@color/white"
        app:layout_constraintEnd_toEndOf="@+id/textView7"
        app:layout_constraintStart_toStartOf="@+id/textView7"
        app:layout_constraintTop_toBottomOf="@+id/textView7" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

## 
