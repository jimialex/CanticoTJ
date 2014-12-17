package jim.app.cantico;


import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Fragment used for managing interactions for and presentation of a navigation drawer.
 * See the <a href="https://developer.android.com/design/patterns/navigation-drawer.html#Interaction">
 * design guidelines</a> for a complete explanation of the behaviors implemented here.
 */
public class NavigationDrawerFragment extends Fragment {

    /**
     * Remember the position of the selected item.
     */
    private static final String STATE_SELECTED_POSITION = "selected_navigation_drawer_position";

    /**
     * Per the design guidelines, you should show the drawer on launch until the user manually
     * expands it. This shared preference tracks this.
     */
    private static final String PREF_USER_LEARNED_DRAWER = "navigation_drawer_learned";

    /**
     * A pointer to the current callbacks instance (the Activity).
     */
    private NavigationDrawerCallbacks mCallbacks;

    /**
     * Helper component that ties the action bar to the navigation drawer.
     */
    private ActionBarDrawerToggle mDrawerToggle;

    private DrawerLayout mDrawerLayout;
    private ListView mDrawerListView;
    private View mFragmentContainerView;

    private int mCurrentSelectedPosition = 0;
    private boolean mFromSavedInstanceState;
    private boolean mUserLearnedDrawer;

    public NavigationDrawerFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Read in the flag indicating whether or not the user has demonstrated awareness of the
        // drawer. See PREF_USER_LEARNED_DRAWER for details.
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(getActivity());
        mUserLearnedDrawer = sp.getBoolean(PREF_USER_LEARNED_DRAWER, false);

        if (savedInstanceState != null) {
            mCurrentSelectedPosition = savedInstanceState.getInt(STATE_SELECTED_POSITION);
            mFromSavedInstanceState = true;
        }

        // Select either the default item (0) or the last selected item.
        selectItem(mCurrentSelectedPosition);
    }

    @Override
    public void onActivityCreated (Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        // Indicate that this fragment would like to influence the set of actions in the action bar.
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        mDrawerListView = (ListView) inflater.inflate(
                R.layout.fragment_navigation_drawer, container, false);
        mDrawerListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                selectItem(position);
            }
        });
        mDrawerListView.setAdapter(new ArrayAdapter<String>(
                getActionBar().getThemedContext(),
                android.R.layout.simple_list_item_activated_1,
                android.R.id.text1,
                new String[]{
                        getString(R.string.title_section1), getString(R.string.title_section2),
                        getString(R.string.title_section3), getString(R.string.title_section4),
                        getString(R.string.title_section5), getString(R.string.title_section6),
                        getString(R.string.title_section7), getString(R.string.title_section8),
                        getString(R.string.title_section9), getString(R.string.title_section10),
                        getString(R.string.title_section11), getString(R.string.title_section12),
                        getString(R.string.title_section13), getString(R.string.title_section14),
                        getString(R.string.title_section15), getString(R.string.title_section16),
                        getString(R.string.title_section17), getString(R.string.title_section18),
                        getString(R.string.title_section19), getString(R.string.title_section20),
                        getString(R.string.title_section21), getString(R.string.title_section22),
                        getString(R.string.title_section23), getString(R.string.title_section24),
                        getString(R.string.title_section25), getString(R.string.title_section26),
                        getString(R.string.title_section27), getString(R.string.title_section28),
                        getString(R.string.title_section29), getString(R.string.title_section30),
                        getString(R.string.title_section31), getString(R.string.title_section32),
                        getString(R.string.title_section33), getString(R.string.title_section34),
                        getString(R.string.title_section35), getString(R.string.title_section36),
                        getString(R.string.title_section37), getString(R.string.title_section38),
                        getString(R.string.title_section39), getString(R.string.title_section40),
                        getString(R.string.title_section41), getString(R.string.title_section42),
                        getString(R.string.title_section43), getString(R.string.title_section44),
                        getString(R.string.title_section45), getString(R.string.title_section46),
                        getString(R.string.title_section47), getString(R.string.title_section48),
                        getString(R.string.title_section49), getString(R.string.title_section50),
                        getString(R.string.title_section51), getString(R.string.title_section52),
                        getString(R.string.title_section53), getString(R.string.title_section54),
                        getString(R.string.title_section55), getString(R.string.title_section56),
                        getString(R.string.title_section57), getString(R.string.title_section58),
                        getString(R.string.title_section59), getString(R.string.title_section60),
                        getString(R.string.title_section61), getString(R.string.title_section62),
                        getString(R.string.title_section63), getString(R.string.title_section64),
                        getString(R.string.title_section65), getString(R.string.title_section66),
                        getString(R.string.title_section67), getString(R.string.title_section68),
                        getString(R.string.title_section69), getString(R.string.title_section70),
                        getString(R.string.title_section71), getString(R.string.title_section72),
                        getString(R.string.title_section73), getString(R.string.title_section74),
                        getString(R.string.title_section75), getString(R.string.title_section76),
                        getString(R.string.title_section77), getString(R.string.title_section78),
                        getString(R.string.title_section79), getString(R.string.title_section80),
                        getString(R.string.title_section81), getString(R.string.title_section82),
                        getString(R.string.title_section83), getString(R.string.title_section84),
                        getString(R.string.title_section85), getString(R.string.title_section86),
                        getString(R.string.title_section87), getString(R.string.title_section88),
                        getString(R.string.title_section89), getString(R.string.title_section90),
                        getString(R.string.title_section91), getString(R.string.title_section92),
                        getString(R.string.title_section93), getString(R.string.title_section94),
                        getString(R.string.title_section95), getString(R.string.title_section96),
                        getString(R.string.title_section97), getString(R.string.title_section98),
                        getString(R.string.title_section99), getString(R.string.title_section100),
                        getString(R.string.title_section101), getString(R.string.title_section102),
                        getString(R.string.title_section103), getString(R.string.title_section104),
                        getString(R.string.title_section105), getString(R.string.title_section106),
                        getString(R.string.title_section107), getString(R.string.title_section108),
                        getString(R.string.title_section109), getString(R.string.title_section110),
                        getString(R.string.title_section111), getString(R.string.title_section112),
                        getString(R.string.title_section113), getString(R.string.title_section114),
                        getString(R.string.title_section115), getString(R.string.title_section116),
                        getString(R.string.title_section117), getString(R.string.title_section118),
                        getString(R.string.title_section119), getString(R.string.title_section120),
                        getString(R.string.title_section121), getString(R.string.title_section122),
                        getString(R.string.title_section123), getString(R.string.title_section124),
                        getString(R.string.title_section125), getString(R.string.title_section126),
                        getString(R.string.title_section127), getString(R.string.title_section128),
                        getString(R.string.title_section129), getString(R.string.title_section130),
                        getString(R.string.title_section131), getString(R.string.title_section132),
                        getString(R.string.title_section133), getString(R.string.title_section134),
                        getString(R.string.title_section135), getString(R.string.title_section136),
                        getString(R.string.title_section137), getString(R.string.title_section138),
                }));
        mDrawerListView.setItemChecked(mCurrentSelectedPosition, true);
        return mDrawerListView;
    }

    public boolean isDrawerOpen() {
        return mDrawerLayout != null && mDrawerLayout.isDrawerOpen(mFragmentContainerView);
    }

    /**
     * Users of this fragment must call this method to set up the navigation drawer interactions.
     *
     * @param fragmentId   The android:id of this fragment in its activity's layout.
     * @param drawerLayout The DrawerLayout containing this fragment's UI.
     */
    public void setUp(int fragmentId, DrawerLayout drawerLayout) {
        mFragmentContainerView = getActivity().findViewById(fragmentId);
        mDrawerLayout = drawerLayout;

        // set a custom shadow that overlays the main content when the drawer opens
        mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow, GravityCompat.START);
        // set up the drawer's list view with items and click listener

        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);

        // ActionBarDrawerToggle ties together the the proper interactions
        // between the navigation drawer and the action bar app icon.
        mDrawerToggle = new ActionBarDrawerToggle(
                getActivity(),                    /* host Activity */
                mDrawerLayout,                    /* DrawerLayout object */
                R.drawable.ic_drawer,             /* nav drawer image to replace 'Up' caret */
                R.string.navigation_drawer_open,  /* "open drawer" description for accessibility */
                R.string.navigation_drawer_close  /* "close drawer" description for accessibility */
        ) {
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                if (!isAdded()) {
                    return;
                }

                getActivity().invalidateOptionsMenu(); // calls onPrepareOptionsMenu()
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                if (!isAdded()) {
                    return;
                }

                if (!mUserLearnedDrawer) {
                    // The user manually opened the drawer; store this flag to prevent auto-showing
                    // the navigation drawer automatically in the future.
                    mUserLearnedDrawer = true;
                    SharedPreferences sp = PreferenceManager
                            .getDefaultSharedPreferences(getActivity());
                    sp.edit().putBoolean(PREF_USER_LEARNED_DRAWER, true).apply();
                }

                getActivity().invalidateOptionsMenu(); // calls onPrepareOptionsMenu()
            }
        };

        // If the user hasn't 'learned' about the drawer, open it to introduce them to the drawer,
        // per the navigation drawer design guidelines.
        if (!mUserLearnedDrawer && !mFromSavedInstanceState) {
            mDrawerLayout.openDrawer(mFragmentContainerView);
        }

        // Defer code dependent on restoration of previous instance state.
        mDrawerLayout.post(new Runnable() {
            @Override
            public void run() {
                mDrawerToggle.syncState();
            }
        });

        mDrawerLayout.setDrawerListener(mDrawerToggle);
    }

    private void selectItem(int position) {
        mCurrentSelectedPosition = position;
        if (mDrawerListView != null) {
            mDrawerListView.setItemChecked(position, true);
        }
        if (mDrawerLayout != null) {
            mDrawerLayout.closeDrawer(mFragmentContainerView);
        }
        if (mCallbacks != null) {
            mCallbacks.onNavigationDrawerItemSelected(position);
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mCallbacks = (NavigationDrawerCallbacks) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException("Activity must implement NavigationDrawerCallbacks.");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mCallbacks = null;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(STATE_SELECTED_POSITION, mCurrentSelectedPosition);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // Forward the new configuration the drawer toggle component.
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        // If the drawer is open, show the global app actions in the action bar. See also
        // showGlobalContextActionBar, which controls the top-left area of the action bar.
        if (mDrawerLayout != null && isDrawerOpen()) {
            inflater.inflate(R.menu.global, menu);
            showGlobalContextActionBar();
        }
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        if (item.getItemId() == R.id.action_example) {
            Toast.makeText(getActivity(), "Visita jw.org", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Per the navigation drawer design guidelines, updates the action bar to show the global app
     * 'context', rather than just what's in the current screen.
     */
    private void showGlobalContextActionBar() {
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setTitle(R.string.app_name);
    }

    private ActionBar getActionBar() {
        return getActivity().getActionBar();
    }

    /**
     * Callbacks interface that all activities using this fragment must implement.
     */
    public static interface NavigationDrawerCallbacks {
        /**
         * Called when an item in the navigation drawer is selected.
         */
        void onNavigationDrawerItemSelected(int position);
    }
}
