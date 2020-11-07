* 중복 제거하기

  ```sql
  SELECT COUNT(NAME) count FROM (SELECT DISTINCT NAME FROM ANIMAL_INS WHERE NAME IS NOT NULL)
  ```

  <img src="images/image-20201024225737732.png" alt="image-20201024225737732" style="zoom:80%;" />

* 고양이와 개는 몇 마리 있을까?

  ```sql
  SELECT DISTINCT ANIMAL_TYPE, COUNT(ANIMAL_TYPE) count FROM ANIMAL_INS GROUP BY ANIMAL_TYPE ORDER BY ANIMAL_TYPE
  ```

  <img src="images/image-20201024225916377.png" alt="image-20201024225916377" style="zoom:80%;" />

* 동명 동물 수 찾기

  ```sql
  SELECT * FROM (SELECT DISTINCT NAME, COUNT(NAME) count FROM ANIMAL_INS GROUP BY NAME) WHERE count >=2 ORDER BY NAME
  ```

  ![image-20201024225933247](images/image-20201024225933247.png)