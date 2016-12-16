package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by Potap on 16.12.2016.
 */
public class ContactDeletionTests extends TestBase {

  @Test

  public void testContactDeletion() {
    app.getNavigationHelper().goToHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().submitContactDeletion();
  }

}
