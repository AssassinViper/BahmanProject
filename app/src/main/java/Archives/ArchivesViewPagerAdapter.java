package Archives;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;



public class ArchivesViewPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragmentList;

    private List<String> fragmentTitleList;

    public ArchivesViewPagerAdapter(FragmentManager fm) {
        super(fm);
        fragmentList = new ArrayList<>();
        fragmentTitleList = new ArrayList<>();
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitleList.get(position);
    }

    public void addFragment(Fragment fragment, String title){

        fragmentList.add(fragment);
        fragmentTitleList.add(title);
    }
}
