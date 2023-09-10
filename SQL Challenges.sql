/* Write an SQL query to display the correct message (meaningful message) from the input
comments_and_translation table. */

--Task 1
SELECT ISNULL(ct.translation, ct.comment)
FROM comments_and_translations AS ct;

--Task 2 Am stuck :(
SELECT source.id, target.id
FROM source
         FULL OUTER JOIN target ON target.id = source.id
WHERE target.id is NULL or source.id is NULL;