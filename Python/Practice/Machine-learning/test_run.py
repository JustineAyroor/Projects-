import pandas as pd


def test_run():
    """Function called by Test Run."""
    df = pd.read_csv("table (1).csv")
    print (df)# TODO: Print All rows of the data frame
    print (df.head())# TODO: Print first 5 rows of the data frame
    print (df.tail())# TODO: Print last 5 rows of the data frame
    print (df[10:16])# TODO: Print desired rows of the data frame


if __name__ == "__main__":
    test_run()
