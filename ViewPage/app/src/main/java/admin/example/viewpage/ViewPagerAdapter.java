package admin.example.viewpage;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fa) {
        super(fa);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0: return new FragmentLinear();
            case 1: return new FragmentGrid();
            case 2: return new FragmentStaggered();
            default: return new FragmentLinear();
        }
    }

    @Override
    public int getItemCount() {
        return 3; // số tab
    }
}
