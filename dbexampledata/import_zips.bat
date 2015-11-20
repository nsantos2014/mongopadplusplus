REM Note: When you mongoimport the data, you will probably see a few duplicate key errors; this is to be expected, and will not prevent the mongoimport from working. There is also an issue with some versions of MongoDB 3.0 where it claims that 0 documents were mongoimported, when in fact there were 29,467 documents imported. You can verify this for yourself by going into the shell and counting the documents in the "test.zips" collection.

mongoimport -d test -c zips --drop zips.json
