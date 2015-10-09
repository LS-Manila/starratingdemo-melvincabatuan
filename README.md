# Simple Star Rating Using Checkbox

starratingdemo-melvincabatuan created by Classroom for GitHub

This assignment illustrates the basic star rating with a group of Checkboxes. 


## Accept

To accept the assignment, click the following URL:

https://classroom.github.com/assignment-invitations/e8cc247c768f1be4639230e3dfdef89b

## Sample Solution:

https://github.com/DeLaSalleUniversity-Manila/starratingdemo-melvincabatuan

## Keypoints:
In the MainActivity.java:
```Java
public class MainActivity extends AppCompatActivity {

    private LinearLayout rating;
    private  CheckBox star;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rating = (LinearLayout) findViewById(R.id.ratings);

        /* Set listeners for each checkbox */
        for (int i = 1; i <= 5; i++) {
            star = (CheckBox) rating.findViewWithTag(String.valueOf(i));
            star.setOnClickListener(starsListener);
        }
    }

    private View.OnClickListener starsListener = new View.OnClickListener() {

        public void onClick(View view) {

            int tag = Integer.valueOf((String) view.getTag());

            /* Check all preceding checkbox and the current tag */
            for (int i = 1; i <= tag; i++) {
                star = (CheckBox) rating.findViewWithTag(String.valueOf(i));
                star.setChecked(true);
            }

            /* Uncheck the rest of the checkbox */
            for (int i = tag + 1; i <= 5; i++) {
                star = (CheckBox) rating.findViewWithTag(String.valueOf(i));
                star.setChecked(false);
            }
        }
    };

}
```

In the xml layout:
```xml
<LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="20dp"
        android:layout_below="@+id/textViewTitle"
        android:orientation="horizontal"
        android:id="@+id/ratings"
        >

        <CheckBox
            android:id="@+id/star1"
            style="?android:attr/starStyle"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:tag="1" />

        <CheckBox
            android:id="@+id/star2"
            style="?android:attr/starStyle"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:tag="2" />

        <CheckBox
            android:id="@+id/star3"
            style="?android:attr/starStyle"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:tag="3" />

        <CheckBox
            android:id="@+id/star4"
            style="?android:attr/starStyle"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:tag="4" />

        <CheckBox
            android:id="@+id/star5"
            style="?android:attr/starStyle"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:tag="5" />

    </LinearLayout>
```


## Submission Procedure with Git: 

```shell
$ cd /path/to/your/android/app/
$ git init
$ git add –all
$ git commit -m "your message, e.x. Assignment 1 submission"
$ git remote add origin <Assignment link copied from assignment github, e.x. https://github.com/DeLaSalleUniversity-Manila/secondactivityassignment-melvincabatuan.git>
$ git push -u origin master
<then Enter Username and Password>
```


## Screenshot:

![alt tag](https://github.com/DeLaSalleUniversity-Manila/starratingdemo-melvincabatuan/blob/master/device-2015-10-09-183229.png)

![alt tag](https://github.com/DeLaSalleUniversity-Manila/starratingdemo-melvincabatuan/blob/master/device-2015-10-09-183248.png)

"*God helps them that help themselves.*" - Benjamin Franklin, "Poor Richard's Almanac"
