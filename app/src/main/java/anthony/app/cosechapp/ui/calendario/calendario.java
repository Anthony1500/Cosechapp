package anthony.app.cosechapp.ui.calendario;

import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import anthony.app.cosechapp.R;
import anthony.app.cosechapp.ui.sistema.SistemaexpertoViewModel;
import anthony.app.cosechapp.ui.sistema.sistemaexperto;

public class calendario extends Fragment {
    Button botonreglas;
    private SistemaexpertoViewModel mViewModel;

    public static sistemaexperto newInstance() {
        return new sistemaexperto();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel =
                new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(SistemaexpertoViewModel.class);
        View v=inflater.inflate(R.layout.calendario, container, false);
        botonreglas=(Button) v.findViewById(R.id.reportetemp);


        return v;





    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(SistemaexpertoViewModel.class);
        // TODO: Use the ViewModel
    }

}