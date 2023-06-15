# Design demo UI - CryptoUI

## Gradle
```gradle
implementation 'com.github.majorkik:SparkLineLayout:1.0.1'
implementation 'com.github.bumptech.glide:glide:4.15.1'
```

## Login
<!-- ![Screenshot_1686539548](https://github.com/code09128/CryptoUI/assets/32324308/57961f69-27ee-4377-82b0-3f9066df784f) -->
<div  align="center"> 
<img src="https://github.com/code09128/CryptoUI/assets/32324308/57961f69-27ee-4377-82b0-3f9066df784f" width="350px"/>
</div>

```xml
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

## MainPage
<!-- ![Screenshot_1686539567](https://github.com/code09128/CryptoUI/assets/32324308/a3f011fe-70c5-4c05-89e1-5fb3661df86d) -->
<div  align="center"> 
<img src="https://github.com/code09128/CryptoUI/assets/32324308/a3f011fe-70c5-4c05-89e1-5fb3661df86d" width="350px"/>
</div>

```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/purple"
    tools:context=".view.MainActivity">

    <ScrollView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical">

            <androidx.constraintlayout.widget.ConstraintLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_margin="16dp"
                android:background="@drawable/top_background_main_activity">

                <ImageView
                    android:id="@+id/imageView4"
                    android:layout_width="85dp"
                    android:layout_height="85dp"
                    android:layout_marginStart="24dp"
                    android:layout_marginTop="24dp"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toTopOf="parent"
                    tools:srcCompat="@tools:sample/avatars" />

                <TextView
                    android:id="@+id/textView9"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_marginStart="24dp"
                    android:text="Lebron James"
                    android:textColor="@color/white"
                    android:textSize="16sp"
                    android:textStyle="bold"
                    app:layout_constraintBottom_toBottomOf="@+id/imageView4"
                    app:layout_constraintStart_toEndOf="@+id/imageView4"
                    app:layout_constraintTop_toTopOf="@+id/imageView4" />

                <TextView
                    android:id="@+id/textView10"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="16dp"
                    android:text="Balanced in USD"
                    android:textColor="@color/white"
                    android:textStyle="bold"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/imageView4" />

                <TextView
                    android:id="@+id/textView11"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="$10,548"
                    android:textColor="@color/white"
                    android:textSize="52sp"
                    android:textStyle="bold"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/textView10" />

                <TextView
                    android:id="@+id/textView12"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text=".11"
                    android:textColor="@color/white"
                    android:textSize="30sp"
                    app:layout_constraintBottom_toBottomOf="@+id/textView11"
                    app:layout_constraintStart_toEndOf="@+id/textView11"
                    app:layout_constraintTop_toBottomOf="@+id/textView10"
                    app:layout_constraintVertical_bias="0.81" />

                <!--4 button icon Set Weight 1-->
                <LinearLayout
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:layout_marginStart="4dp"
                    android:layout_marginTop="16dp"
                    android:layout_marginEnd="4dp"
                    android:layout_marginBottom="16dp"
                    android:orientation="horizontal"
                    app:layout_constraintBottom_toBottomOf="parent"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/textView11">

                    <LinearLayout
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_weight="1"
                        android:orientation="vertical">

                        <androidx.constraintlayout.widget.ConstraintLayout
                            android:layout_width="70dp"
                            android:layout_height="70dp"
                            android:layout_gravity="center"
                            android:layout_margin="4dp"
                            android:background="@drawable/top_button_main">

                            <ImageView
                                android:id="@+id/iv_add"
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                app:layout_constraintBottom_toBottomOf="parent"
                                app:layout_constraintEnd_toEndOf="parent"
                                app:layout_constraintStart_toStartOf="parent"
                                app:layout_constraintTop_toTopOf="parent"
                                app:srcCompat="@drawable/add" />
                        </androidx.constraintlayout.widget.ConstraintLayout>

                        <TextView
                            android:id="@+id/tv_add"
                            android:layout_width="match_parent"
                            android:layout_height="wrap_content"
                            android:layout_marginTop="8dp"
                            android:text="Add"
                            android:textAlignment="center"
                            android:textColor="@color/white">
                        </TextView>
                    </LinearLayout>

                    <LinearLayout
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_weight="1"
                        android:orientation="vertical">

                        <androidx.constraintlayout.widget.ConstraintLayout
                            android:layout_width="70dp"
                            android:layout_height="70dp"
                            android:layout_gravity="center"
                            android:layout_margin="4dp"
                            android:background="@drawable/top_button_main">

                            <ImageView
                                android:id="@+id/iv_send"
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                app:layout_constraintBottom_toBottomOf="parent"
                                app:layout_constraintEnd_toEndOf="parent"
                                app:layout_constraintStart_toStartOf="parent"
                                app:layout_constraintTop_toTopOf="parent"
                                app:srcCompat="@drawable/send" />
                        </androidx.constraintlayout.widget.ConstraintLayout>

                        <TextView
                            android:id="@+id/tv_send"
                            android:layout_width="match_parent"
                            android:layout_height="wrap_content"
                            android:layout_marginTop="8dp"
                            android:text="Send"
                            android:textAlignment="center"
                            android:textColor="@color/white">
                        </TextView>
                    </LinearLayout>

                    <LinearLayout
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_weight="1"
                        android:orientation="vertical">

                        <androidx.constraintlayout.widget.ConstraintLayout
                            android:layout_width="70dp"
                            android:layout_height="70dp"
                            android:layout_gravity="center"
                            android:layout_margin="4dp"
                            android:background="@drawable/top_button_main">

                            <ImageView
                                android:id="@+id/iv_receive"
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                app:layout_constraintBottom_toBottomOf="parent"
                                app:layout_constraintEnd_toEndOf="parent"
                                app:layout_constraintStart_toStartOf="parent"
                                app:layout_constraintTop_toTopOf="parent"
                                app:srcCompat="@drawable/receive" />
                        </androidx.constraintlayout.widget.ConstraintLayout>

                        <TextView
                            android:id="@+id/tv_receive"
                            android:layout_width="match_parent"
                            android:layout_height="wrap_content"
                            android:layout_marginTop="8dp"
                            android:text="receive"
                            android:textAlignment="center"
                            android:textColor="@color/white">
                        </TextView>
                    </LinearLayout>

                    <LinearLayout
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_weight="1"
                        android:orientation="vertical">

                        <androidx.constraintlayout.widget.ConstraintLayout
                            android:layout_width="70dp"
                            android:layout_height="70dp"
                            android:layout_gravity="center"
                            android:layout_margin="4dp"
                            android:background="@drawable/top_button_main">

                            <ImageView
                                android:id="@+id/iv_buy"
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                app:layout_constraintBottom_toBottomOf="parent"
                                app:layout_constraintEnd_toEndOf="parent"
                                app:layout_constraintStart_toStartOf="parent"
                                app:layout_constraintTop_toTopOf="parent"
                                app:srcCompat="@drawable/buy" />
                        </androidx.constraintlayout.widget.ConstraintLayout>

                        <TextView
                            android:id="@+id/tv_buy"
                            android:layout_width="match_parent"
                            android:layout_height="wrap_content"
                            android:layout_marginTop="8dp"
                            android:text="Buy"
                            android:textAlignment="center"
                            android:textColor="@color/white">
                        </TextView>
                    </LinearLayout>
                </LinearLayout>
            </androidx.constraintlayout.widget.ConstraintLayout>

            <TextView
                android:id="@+id/textView14"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:textColor="@color/white"
                android:textSize="18sp"
                android:layout_margin="16dp"
                android:textStyle="bold"
                android:text="Crypto activies" />

            <androidx.recyclerview.widget.RecyclerView
                android:id="@+id/recycleview_crypto"
                android:layout_width="match_parent"
                android:layout_height="200dp">
            </androidx.recyclerview.widget.RecyclerView>
        </LinearLayout>
    </ScrollView>

    <androidx.coordinatorlayout.widget.CoordinatorLayout
        android:layout_width="match_parent"
        android:layout_height="100dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent">

        <!--BottomAppBar
        fabCradleMargin
        fabCradleRoundedCornerRadius
        fabCradleVerticalOffset-->
        <com.google.android.material.bottomappbar.BottomAppBar
            android:id="@+id/app_bar"
            android:layout_width="match_parent"
            android:layout_height="60dp"
            android:layout_gravity="bottom"
            android:backgroundTint="#37386e"
            app:fabCradleMargin="8dp"
            app:fabCradleRoundedCornerRadius="50dp"
            app:fabCradleVerticalOffset="6dp">

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:orientation="horizontal">

                <LinearLayout
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:orientation="vertical">

                    <ImageView
                        android:id="@+id/iv_home"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_margin="5dp"
                        android:layout_weight="1"
                        app:srcCompat="@drawable/bottom_btn1" />

                    <TextView
                        android:id="@+id/tv_home"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_margin="4dp"
                        android:layout_weight="1"
                        android:text="Home"
                        android:textAlignment="center"
                        android:textColor="#9695ce"
                        android:textSize="12sp" />
                </LinearLayout>

                <LinearLayout
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:orientation="vertical">

                    <ImageView
                        android:id="@+id/iv_profile"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_margin="5dp"
                        android:layout_weight="1"
                        app:srcCompat="@drawable/bottom_btn2" />

                    <TextView
                        android:id="@+id/tv_profile"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_margin="4dp"
                        android:layout_weight="1"
                        android:text="Profile"
                        android:textAlignment="center"
                        android:textColor="#9695ce"
                        android:textSize="12sp" />
                </LinearLayout>

                <LinearLayout
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:orientation="vertical"
                    android:visibility="invisible"
                    tools:visibility="invisible">

                    <ImageView
                        android:id="@+id/imageView7"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_margin="5dp"
                        android:layout_weight="1"
                        app:srcCompat="@drawable/bottom_btn1" />

                    <TextView
                        android:id="@+id/textView15"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_margin="4dp"
                        android:layout_weight="1"
                        android:text="Home"
                        android:textAlignment="center"
                        android:textColor="#9695ce"
                        android:textSize="12sp" />
                </LinearLayout>

                <LinearLayout
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:orientation="vertical">

                    <ImageView
                        android:id="@+id/iv_wallet"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_margin="5dp"
                        android:layout_weight="1"
                        app:srcCompat="@drawable/bottom_btn3" />

                    <TextView
                        android:id="@+id/tv_wallet"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_margin="4dp"
                        android:layout_weight="1"
                        android:text="Wallet"
                        android:textAlignment="center"
                        android:textColor="#9695ce"
                        android:textSize="12sp" />
                </LinearLayout>

                <LinearLayout
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:orientation="vertical">

                    <ImageView
                        android:id="@+id/iv_settings"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_margin="5dp"
                        android:layout_weight="1"
                        app:srcCompat="@drawable/bottom_btn4" />

                    <TextView
                        android:id="@+id/tv_settings"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_margin="4dp"
                        android:layout_weight="1"
                        android:text="Settings"
                        android:textAlignment="center"
                        android:textColor="#9695ce"
                        android:textSize="12sp" />
                </LinearLayout>
            </LinearLayout>
        </com.google.android.material.bottomappbar.BottomAppBar>

        <com.google.android.material.floatingactionbutton.FloatingActionButton
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            style="@style/Floating"
            app:layout_anchor="@id/app_bar"
            app:maxImageSize="30dp">
        </com.google.android.material.floatingactionbutton.FloatingActionButton>
    </androidx.coordinatorlayout.widget.CoordinatorLayout>
</androidx.constraintlayout.widget.ConstraintLayout>
```

## Button Style
```xml
<?xml version="1.0" encoding="utf-8"?>
<selector xmlns:android="http://schemas.android.com/apk/res/android">
    <item>
        <shape android:shape="rectangle">
            <gradient android:startColor="#B74CFC" android:endColor="#6E56E2" android:angle="0"/>
            <corners android:radius="10dp"/>
        </shape>
    </item>
</selector>
```

## Edit Text Style
```xml
<?xml version="1.0" encoding="utf-8"?>
<selector xmlns:android="http://schemas.android.com/apk/res/android">
    <item>
        <shape android:shape="rectangle">
            <corners android:radius="10dp"/>
            <solid android:color="#281A56"/>
            <stroke android:color="#281A56" android:width="1dp" />
        </shape>
    </item>
</selector>
```

## Floating button
```xml
<?xml version="1.0" encoding="utf-8"?>
<layer-list xmlns:android="http://schemas.android.com/apk/res/android">
    <item>
        <shape android:shape="oval">
            <gradient android:angle="45" android:endColor="#5e4edd" android:startColor="#974ebd" />
        </shape>
    </item>

    <item
        android:drawable="@drawable/float_icon"
        android:top="15dp"
        android:right="15dp"
        android:left="15dp"
        android:bottom="15dp"/>
</layer-list>
```

## MainPage top background
```xml
<?xml version="1.0" encoding="utf-8"?>
<selector xmlns:android="http://schemas.android.com/apk/res/android">
    <item>
        <shape android:shape="rectangle">
            <gradient
                android:startColor="#5e4edd"
                android:endColor="#974ebd"
                android:angle="-45"/>

            <corners android:radius="45dp"/>
        </shape>
    </item>
</selector>
```
