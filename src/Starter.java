import controller.*;
import view.*;


public class Starter {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() { // run that code on the event dispatch thread
            @Override
            public void run() {
//                HomeController hc = new HomeController();
//                HomeView hv = new HomeView(hc);
//                hv.setVisible(true);
//                RecipeView rv = new RecipeView();
//                rv.setVisible(true);
//                RecommendIngredientListView hv = new RecommendIngredientListView();
//                hv.setVisible(true);
/*                RecipeFormView rfv = new RecipeFormView();
                rfv.setVisible(true);*/

/*              UpdateEquipmentInforController c = new UpdateEquipmentInforController();
                UpdateEquipmentInfoView hv = new UpdateEquipmentInfoView(c);
                hv.setVisible(true);*/

/*                EquipmentInfoController c = new EquipmentInfoController();
                EquipmentInfoView v = new EquipmentInfoView(c);
                v.setVisible(true);*/

/*                NoteInputController c = new NoteInputController();
                NoteInputView v = new NoteInputView(c);
                v.setVisible(true);*/

/*                BrewingHistoryListController c = new BrewingHistoryListController();
                BrewingHistoryListView v = new BrewingHistoryListView(c);
                v.setVisible(true);*/

/*                NoteContentController c = new NoteContentController();
                NoteContentView v = new NoteContentView(c);
                v.setVisible(true);*/

/*                NoteListController c = new NoteListController();
                NoteListView v = new NoteListView(c);
                v.setVisible(true);*/

/*                MissingIngredientListController c = new MissingIngredientListController();
                MissingIngredientsListView v = new MissingIngredientsListView(c);
                v.setVisible(true);*/

                RecommendIngredientListController c = new RecommendIngredientListController();
                RecommendIngredientListView v = new RecommendIngredientListView(c);
                v.setVisible(true);
            }
        });
    }
}
