package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragments.DipsFragment;
import polinema.ac.id.starterchapter05.fragments.HandsFragment;
import polinema.ac.id.starterchapter05.fragments.PushFragment;

public class TugasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas);
    }

    public void handlerClickHandstand(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        HandsFragment handsFragment = (HandsFragment) getSupportFragmentManager().findFragmentByTag("HANDS_FRAGMENT");
        if (handsFragment != null && handsFragment.isVisible()) {
        } else {
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.enter_from_right, R.anim.exit_from_right,R.anim.enter_from_right);
            fragmentTransaction.replace(R.id.TugasLayout, new HandsFragment(), "HANDS_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }


    public void handlerClickDips(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        DipsFragment dipsFragment = (DipsFragment) getSupportFragmentManager().findFragmentByTag("DIPS_FRAGMENT");
        if (dipsFragment != null && dipsFragment.isVisible()) {
        } else {
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.enter_from_right,R.anim.exit_from_right,R.anim.enter_from_right);
            fragmentTransaction.replace(R.id.TugasLayout, new DipsFragment(), "DIPS_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }


    public void handlerClickPush(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        PushFragment pushFragment = (PushFragment) getSupportFragmentManager().findFragmentByTag("PUSH_FRAGMENT");
        if (pushFragment != null && pushFragment.isVisible()) {
        } else {
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.enter_from_right,R.anim.exit_from_right,R.anim.enter_from_right);
            fragmentTransaction.replace(R.id.TugasLayout, new PushFragment(), "PUSH_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
