package org.wheatgenetics.javalib.mstrdtl;

/**
 * Uses:
 * org.junit.Assert
 * org.junit.Test
 *
 * org.wheatgenetics.javalib.mstrdtl.Items
 * org.wheatgenetics.javalib.mstrdtl.TestItem
 * org.wheatgenetics.javalib.mstrdtl.TestItems
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
public class TestItemsTest extends java.lang.Object
{
    @org.junit.Test() public void nullSizeIsZero()
    {
        org.junit.Assert.assertEquals(0,
            new org.wheatgenetics.javalib.mstrdtl.TestItems().size());
    }

    @org.junit.Test() public void sizeAndAppendAndGetWork()
    {
        final org.wheatgenetics.javalib.mstrdtl.TestItems testItems =
            new org.wheatgenetics.javalib.mstrdtl.TestItems();
        testItems.append(); org.junit.Assert.assertEquals(1, testItems.size());

        {
            final org.wheatgenetics.javalib.mstrdtl.TestItem testItem =
                new org.wheatgenetics.javalib.mstrdtl.TestItem(testItems);
            testItem.setPosition(27); testItems.append(testItem);
        }
        org.junit.Assert.assertEquals(2, testItems.size()              );
        org.junit.Assert.assertEquals(1, testItems.get(1).getPosition());
    }

    @org.junit.Test() public void foreignAppendFailsLocalAppendSucceeds()
    {
        final org.wheatgenetics.javalib.mstrdtl.TestItems
            foreignTestItems = new org.wheatgenetics.javalib.mstrdtl.TestItems(),
            localTestItems   = new org.wheatgenetics.javalib.mstrdtl.TestItems();
        final org.wheatgenetics.javalib.mstrdtl.TestItem testItem =
            new org.wheatgenetics.javalib.mstrdtl.TestItem(foreignTestItems);

        org.junit.Assert.assertEquals(0, localTestItems.size());
        localTestItems.append(testItem);
        org.junit.Assert.assertEquals(0, localTestItems.size());

        org.junit.Assert.assertEquals(0, foreignTestItems.size());
        foreignTestItems.append(testItem);
        org.junit.Assert.assertEquals(1, foreignTestItems.size());
    }

    // region get() Tests
    @org.junit.Test() public void emptyItemsGetReturnsNull()
    { org.junit.Assert.assertNull(new org.wheatgenetics.javalib.mstrdtl.TestItems().get(0)); }

    @org.junit.Test(expected = java.lang.IndexOutOfBoundsException.class)
    public void tooSmallPositionGetThrows()
    { new org.wheatgenetics.javalib.mstrdtl.TestItems().get(-55); }

    @org.junit.Test() public void tooSmallPositionGetHasCorrectMessage()
    {
        try { new org.wheatgenetics.javalib.mstrdtl.TestItems().get(-5); }
        catch (final java.lang.IndexOutOfBoundsException e)
        {
            org.junit.Assert.assertEquals(
                org.wheatgenetics.javalib.mstrdtl.TestItem.TOO_SMALL_POSITION_MESSAGE,
                e.getMessage()                                                       );
        }
    }
    // endregion

    // region canMoveDown() Tests
    @org.junit.Test() public void tooSmallPositionCanMoveDownIsFalse()
    {
        org.junit.Assert.assertFalse(
            new org.wheatgenetics.javalib.mstrdtl.TestItems().canMoveDown(-1));
    }

    @org.junit.Test() public void emptyItemsCanMoveDownIsFalse()
    {
        org.junit.Assert.assertFalse(
            new org.wheatgenetics.javalib.mstrdtl.TestItems().canMoveDown(0));
    }

    @org.junit.Test() public void canMoveDownWorks()
    {
        final org.wheatgenetics.javalib.mstrdtl.TestItems testItems =
            new org.wheatgenetics.javalib.mstrdtl.TestItems();
        testItems.append(); org.junit.Assert.assertFalse(testItems.canMoveDown(0));
        testItems.append(); org.junit.Assert.assertFalse(testItems.canMoveDown(1));
        testItems.append(); org.junit.Assert.assertTrue (testItems.canMoveDown(0));
    }
    // endregion

    @org.junit.Test() public void toJsonWorks()
    {
        final org.wheatgenetics.javalib.mstrdtl.TestItems testItems =
            new org.wheatgenetics.javalib.mstrdtl.TestItems();
        {
            final org.wheatgenetics.javalib.mstrdtl.TestItem testItem =
                new org.wheatgenetics.javalib.mstrdtl.TestItem(testItems);
            testItem.setTitleAndContent(); testItems.append(testItem);
        }
        org.junit.Assert.assertEquals(
            /* expected => */"[\n" +
                "  {\n"                                                              +
                "    \"position\": 0,\n"                                             +
                "    \"title\": \"Item 1\",\n"                                       +
                "    \"content\": \"Content of Item 1:\\nMore information here.\"\n" +
                "  }\n"                                                              +
                "]",
            /* actual => */ testItems.toJson());
    }

    @org.junit.Test() public void fromJsonWorks()
    {
        final org.wheatgenetics.javalib.mstrdtl.Items items =
            new org.wheatgenetics.javalib.mstrdtl.TestItems();
        {
            final java.lang.String json = "[\n"                                      +
                "  {\n"                                                              +
                "    \"position\": 0,\n"                                             +
                "    \"title\": \"Item 1\",\n"                                       +
                "    \"content\": \"Content of Item 1:\\nMore information here.\"\n" +
                "  }\n"                                                              +
                "]";
            items.fromJson(json);
            org.junit.Assert.assertEquals(json, items.toJson());
        }
        org.junit.Assert.assertTrue(((org.wheatgenetics.javalib.mstrdtl.TestItem) items.get(0))
            .containersAreTheSame(items));
    }
}