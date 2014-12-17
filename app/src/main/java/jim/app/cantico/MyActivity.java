package jim.app.cantico;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


public class MyActivity extends Activity
        implements NavigationDrawerFragment.NavigationDrawerCallbacks {

    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private NavigationDrawerFragment mNavigationDrawerFragment;

    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */
    private CharSequence mTitle;
    private CharSequence mTitCantico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getFragmentManager().findFragmentById(R.id.navigation_drawer);
        mTitle = getTitle();

        // Set up the drawer.
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));



    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.container, PlaceholderFragment.newInstance("cant_"+(position+1), position + 1))
                .commit();
    }

    ///////////////////
    public void onSectionAttached(int number) {
        switch (number) {
            case 1:
                mTitle = getString(R.string.title_section1);
                break;
            case 2:
                mTitle = getString(R.string.title_section2);
                break;
            case 3:
                mTitle = getString(R.string.title_section3);
                break;
            case 4:
                mTitle = getString(R.string.title_section4);
                break;
            case 5:
                mTitle = getString(R.string.title_section5);
                break;
            case 6:
                mTitle = getString(R.string.title_section6);
                break;
            case 7:
                mTitle = getString(R.string.title_section7);
                break;
            case 8:
                mTitle = getString(R.string.title_section8);
                break;
            case 9:
                mTitle = getString(R.string.title_section9);
                break;
            case 10:
                mTitle = getString(R.string.title_section10);
                break;
            case 11:
                mTitle = getString(R.string.title_section11);
                break;
            case 12:
                mTitle = getString(R.string.title_section12);
                break;
            case 13:
                mTitle = getString(R.string.title_section13);
                break;
            case 14:
                mTitle = getString(R.string.title_section14);
                break;
            case 15:
                mTitle = getString(R.string.title_section15);
                break;
            case 16:
                mTitle = getString(R.string.title_section16);
                break;
            case 17:
                mTitle = getString(R.string.title_section17);
                break;
            case 18:
                mTitle = getString(R.string.title_section18);
                break;
            case 19:
                mTitle = getString(R.string.title_section19);
                break;
            case 20:
                mTitle = getString(R.string.title_section20);
                break;
            case 21:
                mTitle = getString(R.string.title_section21);
                break;
            case 22:
                mTitle = getString(R.string.title_section22);
                break;
            case 23:
                mTitle = getString(R.string.title_section23);
                break;
            case 24:
                mTitle = getString(R.string.title_section24);
                break;
            case 25:
                mTitle = getString(R.string.title_section25);
                break;
            case 26:
                mTitle = getString(R.string.title_section26);
                break;
            case 27:
                mTitle = getString(R.string.title_section27);
                break;
            case 28:
                mTitle = getString(R.string.title_section28);
                break;
            case 29:
                mTitle = getString(R.string.title_section29);
                break;
            case 30:
                mTitle = getString(R.string.title_section30);
                break;
            case 31:
                mTitle = getString(R.string.title_section31);
                break;
            case 32:
                mTitle = getString(R.string.title_section32);
                break;
            case 33:
                mTitle = getString(R.string.title_section33);
                break;
            case 34:
                mTitle = getString(R.string.title_section34);
                break;
            case 35:
                mTitle = getString(R.string.title_section35);
                break;
            case 36:
                mTitle = getString(R.string.title_section36);
                break;
            case 37:
                mTitle = getString(R.string.title_section37);
                break;
            case 38:
                mTitle = getString(R.string.title_section38);
                break;
            case 39:
                mTitle = getString(R.string.title_section39);
                break;
            case 40:
                mTitle = getString(R.string.title_section40);
                break;
            case 41:
                mTitle = getString(R.string.title_section41);
                break;
            case 42:
                mTitle = getString(R.string.title_section42);
                break;
            case 43:
                mTitle = getString(R.string.title_section43);
                break;
            case 44:
                mTitle = getString(R.string.title_section44);
                break;
            case 45:
                mTitle = getString(R.string.title_section45);
                break;
            case 46:
                mTitle = getString(R.string.title_section46);
                break;
            case 47:
                mTitle = getString(R.string.title_section47);
                break;
            case 48:
                mTitle = getString(R.string.title_section48);
                break;
            case 49:
                mTitle = getString(R.string.title_section49);
                break;
            case 50:
                mTitle = getString(R.string.title_section50);
                break;
            case 51:
                mTitle = getString(R.string.title_section51);
                break;
            case 52:
                mTitle = getString(R.string.title_section52);
                break;
            case 53:
                mTitle = getString(R.string.title_section53);
                break;
            case 54:
                mTitle = getString(R.string.title_section54);
                break;
            case 55:
                mTitle = getString(R.string.title_section55);
                break;
            case 56:
                mTitle = getString(R.string.title_section56);
                break;
            case 57:
                mTitle = getString(R.string.title_section57);
                break;
            case 58:
                mTitle = getString(R.string.title_section58);
                break;
            case 59:
                mTitle = getString(R.string.title_section59);
                break;
            case 60:
                mTitle = getString(R.string.title_section60);
                break;
            case 61:
                mTitle = getString(R.string.title_section61);
                break;
            case 62:
                mTitle = getString(R.string.title_section62);
                break;
            case 63:
                mTitle = getString(R.string.title_section63);
                break;
            case 64:
                mTitle = getString(R.string.title_section64);
                break;
            case 65:
                mTitle = getString(R.string.title_section65);
                break;
            case 66:
                mTitle = getString(R.string.title_section66);
                break;
            case 67:
                mTitle = getString(R.string.title_section67);
                break;
            case 68:
                mTitle = getString(R.string.title_section68);
                break;
            case 69:
                mTitle = getString(R.string.title_section69);
                break;
            case 70:
                mTitle = getString(R.string.title_section70);
                break;
            case 71:
                mTitle = getString(R.string.title_section71);
                break;
            case 72:
                mTitle = getString(R.string.title_section72);
                break;
            case 73:
                mTitle = getString(R.string.title_section73);
                break;
            case 74:
                mTitle = getString(R.string.title_section74);
                break;
            case 75:
                mTitle = getString(R.string.title_section75);
                break;
            case 76:
                mTitle = getString(R.string.title_section76);
                break;
            case 77:
                mTitle = getString(R.string.title_section77);
                break;
            case 78:
                mTitle = getString(R.string.title_section78);
                break;
            case 79:
                mTitle = getString(R.string.title_section79);
                break;
            case 80:
                mTitle = getString(R.string.title_section80);
                break;
            case 81:
                mTitle = getString(R.string.title_section81);
                break;
            case 82:
                mTitle = getString(R.string.title_section82);
                break;
            case 83:
                mTitle = getString(R.string.title_section83);
                break;
            case 84:
                mTitle = getString(R.string.title_section84);
                break;
            case 85:
                mTitle = getString(R.string.title_section85);
                break;
            case 86:
                mTitle = getString(R.string.title_section86);
                break;
            case 87:
                mTitle = getString(R.string.title_section87);
                break;
            case 88:
                mTitle = getString(R.string.title_section88);
                break;
            case 89:
                mTitle = getString(R.string.title_section89);
                break;
            case 90:
                mTitle = getString(R.string.title_section90);
                break;
            case 91:
                mTitle = getString(R.string.title_section91);
                break;
            case 92:
                mTitle = getString(R.string.title_section92);
                break;
            case 93:
                mTitle = getString(R.string.title_section93);
                break;
            case 94:
                mTitle = getString(R.string.title_section94);
                break;
            case 95:
                mTitle = getString(R.string.title_section95);
                break;
            case 96:
                mTitle = getString(R.string.title_section96);
                break;
            case 97:
                mTitle = getString(R.string.title_section97);
                break;
            case 98:
                mTitle = getString(R.string.title_section98);
                break;
            case 99:
                mTitle = getString(R.string.title_section99);
                break;
            case 100:
                mTitle = getString(R.string.title_section100);
                break;
            case 101:
                mTitle = getString(R.string.title_section101);
                break;
            case 102:
                mTitle = getString(R.string.title_section102);
                break;
            case 103:
                mTitle = getString(R.string.title_section103);
                break;
            case 104:
                mTitle = getString(R.string.title_section104);
                break;
            case 105:
                mTitle = getString(R.string.title_section105);
                break;
            case 106:
                mTitle = getString(R.string.title_section106);
                break;
            case 107:
                mTitle = getString(R.string.title_section107);
                break;
            case 108:
                mTitle = getString(R.string.title_section108);
                break;
            case 109:
                mTitle = getString(R.string.title_section109);
                break;
            case 110:
                mTitle = getString(R.string.title_section110);
                break;
            case 111:
                mTitle = getString(R.string.title_section111);
                break;
            case 112:
                mTitle = getString(R.string.title_section112);
                break;
            case 113:
                mTitle = getString(R.string.title_section113);
                break;
            case 114:
                mTitle = getString(R.string.title_section114);
                break;
            case 115:
                mTitle = getString(R.string.title_section115);
                break;
            case 116:
                mTitle = getString(R.string.title_section116);
                break;
            case 117:
                mTitle = getString(R.string.title_section117);
                break;
            case 118:
                mTitle = getString(R.string.title_section118);
                break;
            case 119:
                mTitle = getString(R.string.title_section119);
                break;
            case 120:
                mTitle = getString(R.string.title_section120);
                break;
            case 121:
                mTitle = getString(R.string.title_section121);
                break;
            case 122:
                mTitle = getString(R.string.title_section122);
                break;
            case 123:
                mTitle = getString(R.string.title_section123);
                break;
            case 124:
                mTitle = getString(R.string.title_section124);
                break;
            case 125:
                mTitle = getString(R.string.title_section125);
                break;
            case 126:
                mTitle = getString(R.string.title_section126);
                break;
            case 127:
                mTitle = getString(R.string.title_section127);
                break;
            case 128:
                mTitle = getString(R.string.title_section128);
                break;
            case 129:
                mTitle = getString(R.string.title_section129);
                break;
            case 130:
                mTitle = getString(R.string.title_section130);
                break;
            case 131:
                mTitle = getString(R.string.title_section131);
                break;
            case 132:
                mTitle = getString(R.string.title_section132);
                break;
            case 133:
                mTitle = getString(R.string.title_section133);
                break;
            case 134:
                mTitle = getString(R.string.title_section134);
                break;
            case 135:
                mTitle = getString(R.string.title_section135);
                break;
            case 136:
                mTitle = getString(R.string.title_section136);
                break;
            case 137:
                mTitle = getString(R.string.title_section137);
                break;
            case 138:
                mTitle = getString(R.string.title_section138);
                break;
        }
    }

    public void restoreActionBar() {
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
            getMenuInflater().inflate(R.menu.my, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";
        private static final String PAGE = "page_html";

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(String page, int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            args.putString(PAGE, page);
            return fragment;
        }

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {

            View rootView = inflater.inflate(R.layout.fragment_my, container, false);

            Bundle args = getArguments();

            //Toast toast = Toast.makeText(getActivity(), "file:///android_asset/"+args.getString(PAGE)+".html" , Toast.LENGTH_SHORT);
            //toast.show();

            final WebView page = (WebView) rootView.findViewById(R.id.page);

            page.loadUrl("file:///android_asset/"+args.getString(PAGE)+".html");

            //page.loadUrl("http://www.tutorialandroid.com/basico/como-programar-un-webview/");

            return rootView;
        }

        @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);
            ((MyActivity) activity).onSectionAttached(
                    getArguments().getInt(ARG_SECTION_NUMBER));
        }
    }

}
